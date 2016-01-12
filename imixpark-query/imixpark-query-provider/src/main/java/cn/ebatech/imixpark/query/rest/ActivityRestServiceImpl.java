package cn.ebatech.imixpark.query.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.ebatech.imixpark.common.model.market.Activity;
import cn.ebatech.imixpark.common.model.market.ActivityDetail;
import cn.ebatech.imixpark.common.util.CommonUtil;
import cn.ebatech.imixpark.common.util.Constant;
import cn.ebatech.imixpark.query.service.ActivityService;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("activity")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public class ActivityRestServiceImpl implements ActivityRestService {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(ActivityRestServiceImpl.class);

    @Autowired
    private ActivityService activityService;

    String code="";     //状态码
	String message="";   //返回消息
	
    @GET
    @Path("{id : \\d+}")
	@Override
	public Map<String, Object> getActivity(@PathParam("id") Long id) {
		return CommonUtil.returnObjectMap(Constant.CODE_SUCCESS, Constant.MESSAGE_SUCCCESS,
				Activity.class.getSimpleName(), activityService.getActivity(id));
	}
    
    @POST
    @Path("search")
	@Override
	public  Map<String, Object> search(Map<String, Object> parameters) {
		return CommonUtil.returnObjectMap(Constant.CODE_SUCCESS, Constant.MESSAGE_SUCCCESS,
				Activity.class.getSimpleName(), activityService.search(parameters));
	}
    @POST
    @Path("singup")
	@Override
	public Map<String, Object> signUp(Map<String, Object> parameters) {
		try{
			int state= activityService.signUp(parameters);
			if (state==1){
				code="00";
				message="更新成功"; 
			}else{
				code="11";
				message="更新失败";
			}
		}
		catch (Exception e) {
			message="更新失败";
		}
		return CommonUtil.returnObjectMap(code, message, "activity_detail", null);
	}
    @GET
    @Path("count/{act_id}")  //活动id
	@Override
	public Map<String, Object> count(@PathParam("act_id") Long activity_id) {
    	String code="";
    	String message="";
    	int count=0;
		try{
		     count = activityService.count(activity_id);
			code="00";
			message="查询成功";
		}
		catch (Exception e) {
			code="-1";
			message="查询失败";
			return CommonUtil.returnObjectMap(code, message, "activity_detail", count);
		}
		return CommonUtil.returnObjectMap(code, message, "activity_detail", count);
	}
    @GET
    @Path("getyet/{user_id}")   //会员id
	@Override
	public Map<String, Object> getYetActivity(@PathParam("user_id") Long user_id) {
    	String code="";
    	String message="";
    	List<ActivityDetail> adlist=new ArrayList<ActivityDetail>();
    	try{
    		adlist = activityService.getYetActivity(user_id);
    		code="00";
    		message="查询成功";
    	}catch (Exception e) {
			code="-1";
			message="查询失败";
			return CommonUtil.returnObjectMap(code, message, "activity", null);
		}
		 return CommonUtil.returnObjectMap(code, message, "activity", adlist);
	}

    @GET
    @Path("getindent/{act_detail_id}")   //活动明细id
	@Override
	public Map<String, Object> getActivityIndent(@PathParam("act_detail_id")Long activity_detail_id) {
    	String code="";
    	String message="";
    	//List<ActivityDetail> list=new ArrayList<ActivityDetail>();
    	ActivityDetail ad=new ActivityDetail();
    	try{
    		 ad=activityService.getActivityIndent(activity_detail_id);
    		code="00";
    		message="查询成功";
    	}catch (Exception e) {
			code="-1";
			message="查询失败";
			e.printStackTrace();
			return CommonUtil.returnObjectMap(code, message, "activitydetail", null);
		}
		 return CommonUtil.returnObjectMap(code, message, "activitydetail",ad);
	}

    


}
