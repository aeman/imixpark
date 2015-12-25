package cn.ebatech.imixpark.common.util;

import java.util.HashMap;
import java.util.Map;

/**
 * 自定义工具类
 * @author XLJIANG
 */
public class CommonUtil {
	private final static double EARTH_RADIUS = 6378.137;
	
	/**
	 * 封装接口返回值数据体
	 * @param code	返回值代码
	 * @param mes	消息内容
	 * @param key	数据体对象名
	 * @param value	数据体内容
	 * @return
	 */
	public static Map<String,Object> returnObjectMap(String code,String mes, String key,Object value){
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("code", code);
		map.put("message", mes);
		map.put(key, value);
		return map;
	};
	
	/**
	 * 计算两个坐标之间的距离
	 * @param lng1	坐标1经度
	 * @param lat1	坐标1纬度
	 * @param lng2	坐标2经度
	 * @param lat2	坐标2纬度
	 * @return
	 */
	public static double getDistance(double lng1,double lat1,double lng2,double lat2 ){
		double radLat1 = lat1* Math.PI / 180.0;
		double radLat2 = lat2* Math.PI / 180.0;
		double a = radLat1 - radLat2;
		double b = lng1* Math.PI / 180.0 - lng2* Math.PI / 180.0;
		double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a/2),2) + Math.cos(radLat1)*Math.cos(radLat2)*Math.pow(Math.sin(b/2),2)));
		s = s * EARTH_RADIUS;
		return s;
	}
	
}
