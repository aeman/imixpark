package cn.ebatech.imixpark.user.service;

import cn.ebatech.imixpark.user.dao.UserDao;
import cn.ebatech.imixpark.user.fj_dao.fj_UserDao;
import cn.ebatech.imixpark.user.quartz_dao.Quartz_UserDao;
import cn.ebatech.imixpark.common.model.user.BaShop;
import cn.ebatech.imixpark.common.model.user.Integral;
import cn.ebatech.imixpark.common.model.user.LogIntegral;
import cn.ebatech.imixpark.common.model.user.User;

import com.google.common.collect.Maps;

import org.apache.commons.io.IOUtils;
import org.jboss.resteasy.plugins.providers.multipart.InputPart;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
//import org.jboss.resteasy.plugins.providers.multipart.InputPart;
//import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.MultivaluedMap;

@Component
@Transactional
public class UserServiceImpl implements UserService {

	private static final Logger logger = LoggerFactory
			.getLogger(UserServiceImpl.class);
	 private static final String UPLOADED_FILE_PATH = "D:/Users";
	@Autowired //本地接口
	private UserDao userDao;
	@Autowired  //富基 接口   会员库：CRMLS
	private fj_UserDao fj_userDao;
	@Autowired //富基 接口 业务库：hdqtls
	private Quartz_UserDao quartz_UserDao;

	@Override
	public User getUser(int id) {
		return userDao.getUser(id);
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
	public int registerUser(User user) {
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
	public void test() {
		// TODO Auto-generated method stub
		quartz_UserDao.test();
	}
	@Override
	public List<BaShop> findAll() {
		// TODO Auto-generated method stub
		return quartz_UserDao.findAll();
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println("TEST2");
		int i = fj_userDao.test();
		System.out.println("select=" + i);
	}

	@Override
	public int saveUser(User user) {
		// TODO Auto-generated method stub
		return userDao.updateUser(user);
	}


	@Override
	public void updateIcon(MultipartFormDataInput input,String name) {
		Map<String, List<InputPart>> uploadForm = input.getFormDataMap();
		List<InputPart> inputParts = uploadForm.get("uploadedFile");

		for (InputPart inputPart : inputParts) {
			try {
				MultivaluedMap<String, String> header = inputPart.getHeaders();
				String fileName = getFileName(header);
				InputStream inputStream = inputPart.getBody(InputStream.class,
						null);
				byte[] bytes = IOUtils.toByteArray(inputStream);
				fileName = name +"\\" +fileName;
				writeFile(bytes, fileName);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private String getFileName(MultivaluedMap<String, String> header) {

		String[] contentDisposition = header.getFirst("Content-Disposition")
				.split(";");

		for (String filename : contentDisposition) {
			if ((filename.trim().startsWith("filename"))) {
				String[] name = filename.split("=");
				String finalFileName = name[1].trim().replaceAll("\"", "");
				System.out.println("finalFileName="+finalFileName);
				return finalFileName;
				
			}
		}
		return "unknown";
	}

	private void writeFile(byte[] content, String filename) throws IOException {
		System.out.println(filename);
		File file = new File(filename);
		if (!file.exists()) {
			file.createNewFile();
		}
		FileOutputStream fop = new FileOutputStream(file);
		fop.write(content);
		fop.flush();
		fop.close();
	}

	@Override
	public List<Integral> selLogIntegrals(String vipNo) {
		// TODO Auto-generated method stub
		return fj_userDao.findIntegrals(vipNo);
	}

	@Override
	public int editUerPwd(Map<String, Object> parameters) {
		
		return userDao.editUserPwd(parameters);
	}

	@Override
	public String getPwd(int userId) {
		
		return userDao.getPwd(userId);
	}


	@Override
	public void BaShops2localDB(List<BaShop> bs) {
		// TODO Auto-generated method stub
		userDao.addBaShops(bs);
	}
	

}
