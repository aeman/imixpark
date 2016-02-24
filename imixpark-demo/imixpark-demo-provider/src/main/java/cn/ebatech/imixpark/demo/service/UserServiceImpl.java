package cn.ebatech.imixpark.demo.service;

import cn.ebatech.imixpark.demo.dao.UserDao;
import cn.ebatech.imixpark.demo.model.User;
import com.google.common.collect.Maps;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.apache.commons.io.IOUtils;
import org.jboss.resteasy.plugins.providers.multipart.InputPart;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.crypto.spec.SecretKeySpec;
import javax.ws.rs.core.MultivaluedMap;
import javax.xml.bind.DatatypeConverter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.Key;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;


@Component
@Transactional
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    private static final String UPLOADED_FILE_PATH = "/Users/chenxuan/Downloads/";
    private static final String APPKEY_SECRET = "lWxOiKqKPNwJmSldbiSkEbkNjgh2uRSNAb+AEXAMPLE";

    @Autowired
    private UserDao userDao;

    @Override
    public User getUser(Long id) {
        return userDao.get(id);
    }

    @Override
    public List<User> getAllUser() {
        return userDao.getAll();
    }

    @Override
    public User findUserByLoginName(String loginName) {
        return userDao.getUserByLoginName(loginName);
    }

    @Override
    public void updateUser(User user) {
        userDao.update(user);
    }

    @Override
    public void deleteUser(Long id) {
        userDao.delete(id);
    }

    @Override
    public Long registerUser(User user) {
        userDao.save(user);
        System.out.println("[返回新增ID]：" + user.getId());
        return user.getId();
    }

    @Override
    public List<User> searchUser(String loginName, String name) {
        Map<String, Object> parameters = Maps.newHashMap();
        parameters.put("login_name", loginName);
        if (!name.equals("1")) {
            parameters.put("user_name", name);
        }
        return userDao.search(parameters);
    }

    @Override
    public String uploadFile(MultipartFormDataInput input) {
        Map<String, List<InputPart>> uploadForm = input.getFormDataMap();
        List<InputPart> inputParts = uploadForm.get("uploadedFile");
        StringBuffer sb = new StringBuffer();

        for (InputPart inputPart : inputParts) {
            try {
                MultivaluedMap<String, String> header = inputPart.getHeaders();
                String fileName = UUID.randomUUID().toString();//getFileName(header);
                InputStream inputStream = inputPart.getBody(InputStream.class, null);
                byte[] bytes = IOUtils.toByteArray(inputStream);
                fileName = UPLOADED_FILE_PATH + fileName;
                writeFile(bytes, fileName);
                sb.append(fileName);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }

    @Override
    public String login(String name, String passwrod) {
        String id = "imxixpark-ios"; //用户 id
        String subject = "imixpark";
        long ttl = 300 * 1000;   //30秒失效

        //用户验证通过
        if (name.equals("chen") && passwrod.equals("xuan")) {
            String token = createJWT(id, name, subject, ttl);
            return token;
        } else {
            return "err";
        }
    }

    @Override
    public void logout() {

    }

    /*
    iss: The issuer of the token，token 是给谁的
    sub: The subject of the token，token 主题
    exp: Expiration Time。 token 过期时间，Unix 时间戳格式
    iat: Issued At。 token 创建时间， Unix 时间戳格式
    jti: JWT ID。针对当前 token 的唯一标识
    */
    public String createJWT(String id, String issuer, String subject, long ttlMillis) {
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;

        long nowMillis = System.currentTimeMillis();
        Date now = new Date(nowMillis);

        //获取应用 API 键
        byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary(APPKEY_SECRET);   //apiKey.getSecret()
        Key signingKey = new SecretKeySpec(apiKeySecretBytes, signatureAlgorithm.getJcaName());

        JwtBuilder builder = Jwts.builder().setId(id)
                .setIssuedAt(now)
                .setSubject(subject)
                .setIssuer(issuer)
                .signWith(signatureAlgorithm, signingKey);

        //设置 token 失效时间
        if (ttlMillis >= 0) {
            long expMillis = nowMillis + ttlMillis;
            Date exp = new Date(expMillis);
            builder.setExpiration(exp);
        }

        return builder.compact();
    }

    /**
     * header sample
     * {
     * Content-Type=[image/png],
     * Content-Disposition=[form-data; name="file"; filename="filename.extension"]
     * }
     **/
    private String getFileName(MultivaluedMap<String, String> header) {

        String[] contentDisposition = header.getFirst("Content-Disposition").split(";");

        for (String filename : contentDisposition) {
            if ((filename.trim().startsWith("filename"))) {

                String[] name = filename.split("=");

                String finalFileName = name[1].trim().replaceAll("\"", "");
                return finalFileName;
            }
        }
        return "unknown";
    }

    private void writeFile(byte[] content, String filename) throws IOException {
        File file = new File(filename);
        if (!file.exists()) {
            file.createNewFile();
        }
        FileOutputStream fop = new FileOutputStream(file);
        fop.write(content);
        fop.flush();
        fop.close();
    }
}
