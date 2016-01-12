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
import cn.ebatech.imixpark.wifi.service.SuggestionService;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;

@Path("suggestion")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public class SuggestionRestServiceImpl  implements SuggestionRestService {

	
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(SuggestionRestServiceImpl.class);

    @Autowired
    private SuggestionService suggestionService;

    public void setSuggestionService(SuggestionService suggestionService) {
		this.suggestionService = suggestionService;
	}
	 String code="";     //状态码
	 String message="";   //返回消息
	 
	
	@POST
	@Path("saveSuggestion")
	@Override	
	public Map<String, Object> saveSuggestion(Map<String, Object> parameters){
		if(parameters!=null){
			try{
				int state= suggestionService.save(parameters);
				if (state==1){
					code="00";
					message="保存成功";
				}else{
					code="11";
					message="保存失败";
				}
			}
			catch (Exception e) {
				message="保存失败";
			}
		}
		
		return CommonUtil.returnObjectMap(code, message, "suggestion", null);
				
	}


	@POST
	@Path("editPwd")
	@Override
	public Map<String, Object> editUserPwd(Map<String, Object> parameters) {
		String pwd=suggestionService.getPwd(Integer.parseInt(parameters.get("userId").toString()));
		
		if(parameters.get("pwd").toString().equals(pwd)){
			
			try {
				int state= suggestionService.editUerPwd(parameters);
				if(state==1){
					code="00";
					message="保存密码成功";
				}else{
					code="11";
					message="修改密码失败";
				}
				
			} catch (Exception e) {
				
				message="修改密码失败";
				
			}
			
		}else{
			code="11";
			message="输入密码与原密码不符";
		}

		return CommonUtil.returnObjectMap(code, message, "user", null);
	};
}
