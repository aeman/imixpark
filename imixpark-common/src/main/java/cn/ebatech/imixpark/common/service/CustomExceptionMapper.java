package cn.ebatech.imixpark.common.service;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;

import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

/**
 * Created by chenxuan on 16/1/15.
 */
//@Provider
public class CustomExceptionMapper implements ExceptionMapper<NotFoundException> {

    @Override
    public Response toResponse(NotFoundException e) {
        return Response.status(Response.Status.NOT_FOUND).entity(e.getMessage()).type(ContentType.APPLICATION_JSON_UTF_8).build();
    }

//    @Override
//    public Response toResponse(ServiceException e) {
//        return Response.status(Response.Status.NOT_FOUND).entity("user:Oops!!").type(ContentType.APPLICATION_JSON_UTF_8).build();
//    }

}
