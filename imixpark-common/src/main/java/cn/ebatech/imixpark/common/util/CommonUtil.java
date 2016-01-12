package cn.ebatech.imixpark.common.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * 自定义工具类
 * @author XLJIANG
 */
public class CommonUtil {
	private static final double EARTH_RADIUS = 6378.137;
	
	/**
	 * 返回多个数据体之前设置所有数据体key值（必须与putVal方法参数一一对应）
	 * @param key	数据体所有key值
	 */
	public static String[] putKey(String... key){
		return key;
	};
	
	/**
	 * 返回多个数据体之前设置所有数据体value值（必须与putKey方法参数一一对应）
	 * @param val   数据体所有value值
	 */
	public static Object[] putVal(Object... val){
		return val;
	};
	
	/**
	 * 封装接口返回值（多个数据体）
	 * @param code 返回值代码
	 * @param message 消息内容
	 * @param key	多数据体key值数组
	 * @param object	多数据体value值数组
	 * @return	Map
	 */
	public static Map<String,Object> returnObjectMap(String code, String message, String[] key, Object[] object){
		Map<String,Object> map = new HashMap<String, Object>();
		map.put(Constant.CODE, code);
		map.put(Constant.MESSAGE, message);
		if(key!=null && object!=null && key.length==object.length){
			for(int i=0;i<key.length;i++){
				if(key[i]!=null && !key[i].equals(""))
					map.put(key[i], object[i]);
			}
		}
		return map;
	};
	
	/**
	 * 封装接口返回值（单个数据体）
	 * @param code	返回值代码
	 * @param message	消息内容
	 * @param key	数据体对象名
	 * @param object	数据体内容
	 * @return Map
	 */
	public static Map<String,Object> returnObjectMap(String code, String message, String key, Object object){
		Map<String,Object> map = new HashMap<String, Object>();
		map.put(Constant.CODE, code);
		map.put(Constant.MESSAGE, message);
		if(key!=null && !key.equals(""))
			map.put(key, object);
		return map;
	};
	
	/**
	 * 计算两个坐标之间的距离
	 * @param lng1	坐标1经度
	 * @param lat1	坐标1纬度
	 * @param lng2	坐标2经度
	 * @param lat2	坐标2纬度
	 * @return double 坐标间距
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
	/**
	 * 生成随机数
	 * @return
	 */
	public static int getRandom(){
		Random r=new Random();
		int i=r.nextInt(999999);
		int j=0;
		if(i>100000){
			j=i;
		}
		return j;
	}
}
