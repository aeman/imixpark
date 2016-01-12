package cn.ebatech.imixpark.query.rest;

import java.util.List;
import java.util.Map;

import cn.ebatech.imixpark.common.model.user.PushSetting;
import cn.ebatech.imixpark.common.util.CommonUtil;
import cn.ebatech.imixpark.common.util.Constant;
import cn.ebatech.imixpark.query.service.PushSettingService;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("pushSetting")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public class PushSettingRestServiceImpl implements PushSettingRestService {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(PushSettingRestServiceImpl.class);

    @Autowired
    private PushSettingService pushSettingService;

    @GET
    @Path("{id : \\d+}")
	@Override
	public Map<String, Object> getPushSetting(@PathParam("id") Long id) {
		return CommonUtil.returnObjectMap(Constant.CODE_SUCCESS, Constant.MESSAGE_SUCCCESS,
				PushSetting.class.getSimpleName(), pushSettingService.getPushSetting(id));
	}
    
    @POST
    @Path("search")
	@Override
	public  Map<String, Object> search(Map<String, Object> parameters) {
		return CommonUtil.returnObjectMap(Constant.CODE_SUCCESS, Constant.MESSAGE_SUCCCESS,
				PushSetting.class.getSimpleName(), pushSettingService.search(parameters));
	}

    @POST
    @Path("saveOrUpdate")
	@Override
	public Map<String, Object> saveOrUpdate(Map<String, Object> parameters) {
    	try{
    		List<PushSetting> psList = pushSettingService.search(parameters);
			if(psList==null || psList.size()==0){
				pushSettingService.savePushSetting(parameters);
				return CommonUtil.returnObjectMap(Constant.CODE_SUCCESS, Constant.MESSAGE_SUCCCESS, 
						PushSetting.class.getSimpleName(), null);
			}else{
				int rows = pushSettingService.updatePushSetting(parameters);
				if(rows > 0)
					return CommonUtil.returnObjectMap(Constant.CODE_SUCCESS, Constant.MESSAGE_SUCCCESS,
							PushSetting.class.getSimpleName(), null);
				else
					return CommonUtil.returnObjectMap(Constant.CODE_ERROR, Constant.MESSAGE_ERROR,
							PushSetting.class.getSimpleName(), null);
			}
		}catch(Exception ex){
			ex.printStackTrace();
			return CommonUtil.returnObjectMap(Constant.CODE_ERROR, Constant.MESSAGE_ERROR,
					PushSetting.class.getSimpleName(), null);
		}
	}

}
