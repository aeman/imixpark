package cn.ebatech.imixpark.wifi.service;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import com.ruijie.wmc.open.ClientHelper;
import com.ruijie.wmc.open.JsonUtil;

@Component
@Transactional
public class RbisServiceImpl implements RbisService{

	@Override
	public String offlineWithDecrypt(Map<String, Object> parameters) {
		
	HashMap<String,String> params = new HashMap<String,String>();
	
//	String userId=params.get("userId").toString();
//	String serialno=params.get("serialno").toString();
	
	 params.put("method", "auth.offlineWithDecrypt");
	 params.put("userId", "c6e30c220eb74704");
	 params.put("serialno","db1ebcf32ebd03055301912484081768");

//	 String resultJson = ClientHelper.sendRequest("http://127.0.0.1/open/service","分配的md5密匙","分配的des密匙","分配的appId",JsonUtil.toJsonString(params));
	
//	 String resultJson = ClientHelper.sendRequest("http://wmc.ruijieyun.com/open/test","EDYWVM3JKGTC","TE4L6BAZ5DCOMGASE3M3ZIKV","680486",JsonUtil.toJsonString(params));
	 String resultJson = "{\"content\":{\"code\":\"100\",\"desc\":\"success\"}}";
//	 {"content":{"code":"100","desc":"success"}}
	 return resultJson;
	}

	@Override
	public String userOnlineWithDecrypt(Map<String, Object> parameters) {
		HashMap<String,String> params = new HashMap<String,String>();
//		  参数说明：userId：用户ID，serialno：设备序列号，mac：用户终端mac，ip：用户IP，username：用户名
		 String userId=parameters.get("id").toString();
		 String serialno=parameters.get("serialno").toString();
		 String mac=parameters.get("mac").toString();
		 String ip=parameters.get("ip").toString();
		//如果是非手机认证和非固定账号认证时，则为用户名与mac参数相同
		 String username=parameters.get("mac").toString(); 
		 params.put("method", "auth.userOnlineWithDecrypt");
		 params.put("userId", userId);
		 params.put("serialno",serialno);
		 params.put("mac",mac);
		 params.put("ip",ip);
		 params.put("username",username);
		 
//		 String resultJson = ClientHelper.sendRequest("http://127.0.0.1/open/service","分配的md5密匙","分配的des密匙","分配的appId",JsonUtil.toJsonString(params));
		 String resultJson = ClientHelper.sendRequest("http://wmc.ruijieyun.com/open/test","EDYWVM3JKGTC","TE4L6BAZ5DCOMGASE3M3ZIKV","680486",JsonUtil.toJsonString(params));

		return resultJson;
	}  
	

}
