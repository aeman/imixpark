package cn.ebatech.imixpark.market.util;

import java.util.HashMap;
import java.util.Map;

/**
 * 自定义工具类
 * @author XLJIANG
 */
public class MyUtil {
	private final static double EARTH_RADIUS = 6378.137;  //地球半径
	
	/**
	 * 返回接口消息
	 * @param message	消息内容
	 * @return
	 */
	public static Map<String,Object> returnMessage(String message){
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("message", message);
		return map;
	}

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
