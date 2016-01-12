package cn.ebatech.imixpark.wifi.rest;

import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import cn.ebatech.imixpark.common.util.CommonUtil;
import cn.ebatech.imixpark.wifi.service.RbisService;
import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.alibaba.fastjson.JSONObject;

@Path("wifi")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public class RbisRestServiceImpl implements RbisRestService{
	 private static final org.slf4j.Logger logger = LoggerFactory.getLogger(RbisRestServiceImpl.class);

    @Autowired
    private RbisService rbisService;
    
   
    @POST
	@Path("offlineWithDecrypt")
	@Override	
	public Map<String, Object> offlineWithDecrypt(Map<String, Object> parameters) {
    	 String code="";     //状态码
    	 String message="";   //返回消息
    	if(parameters!=null){
			try{
				String resultJson =rbisService.offlineWithDecrypt(parameters);
				//转换为json数据
				JSONObject jsonObject = JSONObject.parseObject(resultJson) ;
				JSONObject content=(JSONObject) jsonObject.get("content");
				
				int state=content.getIntValue("code");
				if (state==100){
					code="00";
					message="用户下线成功！";
				}else{
					code="11";
					message="用户下线失败！";
				}
			}
			catch (Exception e) {
	
				message="系统错误，用户下线失败！";
			}
		}
		
		return CommonUtil.returnObjectMap(code, message, "", null);
	}

    @POST
   	@Path("userOnlineWithDecrypt")
	@Override
	public Map<String, Object> userOnlineWithDecrypt(Map<String, Object> parameters) {
		 String code="";     //状态码
    	 String message="";   //返回消息
    	if(parameters!=null){
			try{
				String resultJson =rbisService.offlineWithDecrypt(parameters);
				//转换为json数据
				JSONObject jsonObject = JSONObject.parseObject(resultJson) ;
				//content  所有数据
				JSONObject content=(JSONObject) jsonObject.get("content");
				int state=content.getIntValue("code");
				
				if (state==100){
					code="00";
					message="用户成功上线！";
				}else{
					code="11";
					message=content.getString("desc");
				}
			}
			catch (Exception e) {

				message="系统错误，用户上线失败！";
			}
		}
		return CommonUtil.returnObjectMap(code, message, "", null);
	}

}
