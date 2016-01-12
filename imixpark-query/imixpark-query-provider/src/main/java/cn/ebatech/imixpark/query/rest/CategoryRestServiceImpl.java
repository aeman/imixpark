package cn.ebatech.imixpark.query.rest;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import cn.ebatech.imixpark.common.model.market.Category;
import cn.ebatech.imixpark.common.util.CommonUtil;
import cn.ebatech.imixpark.common.util.Constant;
import cn.ebatech.imixpark.query.service.CategoryService;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("category")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public class CategoryRestServiceImpl implements CategoryRestService {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(CategoryRestServiceImpl.class);

    @Autowired
    private CategoryService categoryService;

    @GET
    @Path("{id : \\d+}")
	@Override
	public Map<String, Object> getCategory(@PathParam("id") Long id) {
		return CommonUtil.returnObjectMap(Constant.CODE_SUCCESS, Constant.MESSAGE_SUCCCESS,
				Category.class.getSimpleName(), categoryService.getCategory(id));
	}
    
    @POST
    @Path("search")
    @Override
    public Map<String, Object> search(Map<String, Object> parameters) {
    	return CommonUtil.returnObjectMap(
    			Constant.CODE_SUCCESS, 
    			Constant.MESSAGE_SUCCCESS,
    			CommonUtil.putKey(Category.class.getSimpleName(), "mall_id", "sort", "floor"),
    			CommonUtil.putVal(categoryService.search(parameters), parameters.get("mall_id"), getSortMap(), getFloorMap()));
    }
    
    public Map<String,Object> getSortMap(){
    	Map<String, Object> sortMap = new LinkedHashMap<String, Object>();
    	sortMap.put("store_id", "默认");
    	sortMap.put("store_name", "商户名称");
    	sortMap.put("store_open_time", "营业时间");
    	return sortMap;
    }
    
    public Map<String,Object> getFloorMap(){
    	Map<String, Object> floorMap = new LinkedHashMap<String, Object>();
    	floorMap.put("defult", 0);
    	floorMap.put("F1", 1);
    	floorMap.put("F2", 2);
    	floorMap.put("F3", 3);
    	floorMap.put("F4", 4);
    	floorMap.put("F5", 5);
    	floorMap.put("F6", 6);
    	return floorMap;
    }

}
