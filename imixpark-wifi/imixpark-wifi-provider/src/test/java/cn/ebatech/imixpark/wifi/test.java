package cn.ebatech.imixpark.wifi;

import java.util.HashMap;
import com.ruijie.wmc.open.ClientHelper;
import com.ruijie.wmc.open.JsonUtil;

public class test {
	
	public static void main(String[] args) {
		
		 String resultJson =offlineWithDecrypt();
		 System.out.println("params11111:"+resultJson);
    }
	
	public static String offlineWithDecrypt() {
		
		HashMap<String,String> params = new HashMap<String,String>();

		 params.put("method", "auth.offlineWithDecrypt");
		 params.put("userId", "c6e30c220eb74704");
		 params.put("serialno","db1ebcf32ebd03055301912484081768");
//		 String resultJson = ClientHelper.sendRequest("http://127.0.0.1/open/service","分配的md5密匙","分配的des密匙","分配的appId",JsonUtil.toJsonString(params));
		 System.out.println("params:"+JsonUtil.toJsonString(params));
	
		 String resultJson = ClientHelper.sendRequest("http://wmc.ruijieyun.com/open/test","EDYWVM3JKGTC","TE4L6BAZ5DCOMGASE3M3ZIKV","680486",JsonUtil.toJsonString(params));
		 System.out.println(resultJson);
		 return resultJson;
	}  

}
