package cn.ebatech.imixpark.user.rest;

import cn.ebatech.imixpark.common.model.user.User;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;

import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.Min;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;


@Path("users2")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public interface UserRestService2 {

    /**
     *参数：会员ID 返回值：用户信息(卡信息、会员等级、积分、成长值区间。)
     *
     *   消费记录查询接口
     *   我的特权接口
     *   积分记录接口
     *   查询用户基本信息接口
     *   返回值：卡信息、会员等级、积分、成长值区间。接口
     */
    @GET
    @Path("{id : \\d+}")
    User getUser(@PathParam("id") @Min(1L) int id);
    
    /**
     * 用户在修改基本信息页面，选择单项内容修改后，调用此接口更新用户基本信息。 参数：昵称、性别、生日、会员ID    
     * 返回值：保存成功或失败消息
     * @param id
     * @return
     */
    @POST
    @Path("{id : \\d+}/{sex}/{birthday}/{nickname}")
    void updateUser(@PathParam("id") @Min(1L) int id,
    				@PathParam("id") String sex,
    				@PathParam("id") String birthday,
    				@PathParam("id") String nickname
    				);
    
    /**
     *  修改用户头像接口
     */
    @POST
    @Path("{id : \\d+}/{yy:\\d}")
    void updateUserIoc(@PathParam("id") @Min(1L) int id);
    
    @POST
    @Path("updateIcon2/{userID}")
    void updateIcon2(int userID) ;

    
  
}
