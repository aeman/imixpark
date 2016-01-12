package cn.ebatech.imixpark.query.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import cn.ebatech.imixpark.common.model.market.Mall;
import cn.ebatech.imixpark.common.util.CommonUtil;
import cn.ebatech.imixpark.common.util.Constant;
import cn.ebatech.imixpark.query.service.MallService;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("mall")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public class MallRestServiceImpl implements MallRestService {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(MallRestServiceImpl.class);

    @Autowired
    private MallService mallService;

    @GET
    @Path("{id : \\d+}")
	@Override
	public Map<String, Object> getMall(@PathParam("id") Long id) {
		return CommonUtil.returnObjectMap(Constant.CODE_SUCCESS, Constant.MESSAGE_SUCCCESS,
				Mall.class.getSimpleName(), mallService.getMall(id));
	}
    
    @GET
    @Path("getMallByCoordinate/{x}/{y}")
    @Override
	public Map<String, Object> getMallByCoordinate(@PathParam("x") Double x_c, @PathParam("y") Double y_c) {
		return CommonUtil.returnObjectMap(Constant.CODE_SUCCESS, Constant.MESSAGE_SUCCCESS,
				Mall.class.getSimpleName(), recomposeMallList(x_c, y_c));
	}

    @POST
    @Path("search")
	@Override
	public Map<String, Object> search(Map<String, Object> parameters) {
		return CommonUtil.returnObjectMap(Constant.CODE_SUCCESS, Constant.MESSAGE_SUCCCESS,
				Mall.class.getSimpleName(), mallService.search(parameters));
	}
    
    /**
     * 根据用户坐标重组商场列表，最近商场排在第一位
     * @param x_c	经度
     * @param y_c	纬度
     * @return	商场集合
     */
    public List<Mall> recomposeMallList(Double x_c, Double y_c){
    	List<Mall> mallList = mallService.getMallByCoordinate(x_c, y_c);
    	//默认值直接返回
		if(x_c.intValue() == 0 && y_c.intValue() == 0){
			return mallList;
		}
		//计算坐标，找到最近商场
		Double shotIns = null;
		Mall ma = null;
		for(Mall mall : mallList){
			Double ins = CommonUtil.getDistance(x_c, y_c, 
					Double.parseDouble(mall.getMall_longitude()), Double.parseDouble(mall.getMall_latitude()));
			if(shotIns==null || (shotIns!=null && shotIns>ins)){
				shotIns = ins;
				ma = mall;
			}
		}
		//组合最近商场和所有商场集合返回数据
		List<Mall> resultList = new ArrayList<Mall>();
		resultList.add(ma);
		for(Mall mall : mallList){
			if(!resultList.contains(mall)){
				resultList.add(mall);
			}
		}
		return resultList;
    }
}
