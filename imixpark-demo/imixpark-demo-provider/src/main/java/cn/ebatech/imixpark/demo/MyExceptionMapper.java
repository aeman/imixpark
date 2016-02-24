package cn.ebatech.imixpark.demo;

import cn.ebatech.imixpark.common.util.CommonUtil;
import com.alibaba.dubbo.rpc.RpcException;
import com.alibaba.dubbo.rpc.protocol.rest.RpcExceptionMapper;
import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;

import javax.ws.rs.core.Response;

/**
 * Created by chenxuan on 16/2/22.
 */
public class MyExceptionMapper extends RpcExceptionMapper {

    @Override
    public Response toResponse(RpcException e) {
        Object o = CommonUtil.returnObjectMap(String.valueOf(e.getCode()), e.getMessage(), "", null);
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(o).type(ContentType.APPLICATION_JSON_UTF_8).build();
    }
}
