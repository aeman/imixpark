package cn.ebatech.imixpark.market.rest;

import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cn.ebatech.imixpark.market.service.ActivityService;
import cn.ebatech.imixpark.market.util.MyUtil;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
@Path("activity")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public class ActivityRestServiceImpl implements ActivityRestService{

	private static final Logger logger=LoggerFactory.getLogger(ActivityRestServiceImpl.class);
	
	@Autowired
	private ActivityService activityService;
	
	@POST
	@Path("save")
	@Override
	public Map<String, Object> saveOrUpdate(Map<String, Object> params) {
        
			String message="";
			try{
		 activityService.saveOrUpdate(params);
		 message="insert success";
			}
			catch (Exception e) {
				// TODO: handle exception
				message="insert defield";
			}
			return MyUtil.returnMessage(message);
	}

	@POST
	@Path("updateyetact")
	@Override
	public int updateYetActivity(Map<String, Object> params) {
		return activityService.updateYetActivity(params);
	}

}
