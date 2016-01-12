package cn.ebatech.imixpark.user.webService_fj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.ws.Holder;

import org.junit.Before;
import org.junit.Test;

import cn.ebatech.imixpark.common.model.user.Message;

public class sendws {
	public static String userid = "O2O1";
	public static String password = "AD560A78A9E29F8B";
	public static String cmdid6001 = "6001";
	public static String cmdid6002 = "6002";
	public static String cmdid6003 = "6003";
	public static String cmdid6004 = "6004";
	public static String cmdid6005 = "6005";
	public static String cmdid6006 = "6006";
	public static String cmdid6007 = "6007";
	public static String cmdid6010 = "6010";
	public static String vipno = "60060825";
	public static String phoneno = "15808084597";
	public static String shenfno = "130102198201090668";
	public static String[] inputpara6001 = { "60060825", "130102198201090668","15808084597" };
	public static String[] inputpara6002 = {"15808284597","132102198201090668","yougen","1"};
	public static String[] inputpara6003 = {"1","03003544"};
	public static String[] inputpara6004 = new String[5];
	public static String[] inputpara6005 = new String[1];
	public static String[] inputpara6006 = new String[3];
	public static String[] inputpara6007 = new String[6];
	public static String[] inputpara6010 = new String[3];
	/**
	 * 根据会员卡号查询
	 */
	public static final String FINDBYVIPNO="1";
	/**
	 * 根据手机号查询
	 */
	public static final String FINDBYPHONENO="2";




	public static void main2(String[] args) {
		/**
		 * 会员卡号 身份证号 手机号 卡号 60060825/03003544/130005478 身份证号
		 * 130102198201090668/110105197205294159/11010319780522061X 手机号
		 * 15808084597/18610093073/13436154688
		 * 60060825 130102198201090668 15808084597
		 */
		NFrdif s = new NFrdif();
		NFrdifSoap ss = s.getNFrdifSoap();

	}
	/**
	 * 1.会员验证
	 * 参数 会员卡号 身份证号 手机号
	 * 返回值 成功标识 提示信息 实际卡号
	 */
	 
	public static Message send6001(String userid, String password,List<String> ps) {
		//System.out.println(sendws.arry2str(inputpara6001));
		return send(userid,password,cmdid6001,sendws.arry2str(inputpara6001));
	}
	/**
	 * 会员注册
	 * 参数 手机号码 身份证号 会员姓名 性别 （0：男；1：女）（可选）
	 * 返回值  成功标识(0 失败 1 成功 ) 提示信息, 卡号, 卡类型, 手机号, 身份证号, 会员ID
	 */
	 
	public static Message send6002(String userid, String password,List<String> ps) {
		return send(userid,password,cmdid6002, sendws.arry2str(inputpara6002));
	}
	/**
	 * 会员信息查询
	 * 参数 查询方式 查询条件
	 * 返回值 成功标识,提示信息,会员账号，卡号,姓名，卡类型 ,卡类型名称，是否有积分账户,
	 *     是否可以会员折扣, 当前有效积分, 有效期, 电话, 身份证号, 性别, 生日, 地址, 维护门店,
	 */
	 
	public static Message send6003(List<String> ps) {
		return sendws.send(userid,password,cmdid6003, sendws.arry2str(ps.toArray()));
	}
	/**
	 * 积分增减
	 * 参数 会员卡号, 积分值, 积分处理类型, 门店代码, 流水号
	 * 返回值  成功标识, 提示信息, 会员账号, 卡号, 姓名, 卡类型, 卡类型名称, 是否有积分账户,
	 *      是否可以会员折扣, 当前有效积分, 有效期, 电话, 身份证号, 性别, 邮箱, 生日, 地址, 维护门店
	 */
	 
	public static Message send6004(String userid, String password,List<String> ps) {
		return send(userid,password,cmdid6004, arry2str(ps.toArray()));
	}
	/**
	 * 会员账户积分查询
	 * 参数 会员卡号, 身份证号, 手机号,
	 * 返回值 成功标识， 提示信息， 积分余额
	 */
	 
	public static Message send6005(String userid, String password,List<String> ps) {
		inputpara6005[0]="60060825";
		return send(userid,password,cmdid6005, arry2str(inputpara6005));
		
	}
	/**
	 * 消费记录查询
	 * 会员卡号， 身份证号， 手机号
	 * 返回值 成功标识， 提示信息， 日志序列号， 门店名称， 卡号， 事物名称，
		发生日期， 收银机号， 小票号， 柜组名称， 商品编码， 商品名称， 成交金额， 积分
	 */
	 
	public static Message send6006(List<String> ps) {
		return send(userid,password,cmdid6006, arry2str(ps.toArray()));
	}
	/**
	 * 会员信息更改
	 * 参数 会员卡号， 手机号， 出生日期， 性别， 地址， 邮箱
	 * 返回值 成功标识， 提示信息
	 */
	 
	public void send6007(String userid, String password,List<String> ps) {
		send(userid,password,cmdid6007, arry2str(inputpara6007));
	}

	public static Message send(String userid, String password,String cmdid, String inputpara) {
		Map<String,Object> data=new HashMap<String,Object>();
		Holder<String> outputpara = new Holder<String>();
	    Holder<Integer> rtn = new Holder<Integer>();
		Holder<String> errormsg = new Holder<String>();
		Holder<Short> result = new Holder<Short>();
		NFrdif nfridf=new NFrdif();
		NFrdifSoap soap=nfridf.getNFrdifSoap();
		soap.processdata(userid,password,cmdid, inputpara, outputpara,
				rtn, errormsg, result);
		Message ms=new Message(outputpara,rtn,errormsg,result);
		return ms;
	}


	public static String arry2str(Object[] ary) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < ary.length; i++) {
			
			if(i==ary.length-1){
				sb.append(((String)ary[i]).trim());
			}else{
				sb.append(((String)ary[i]).trim()+ ",");
			}
			
		}
		String newStr = sb.toString();
		return newStr;
	}
	public static void main(String[] args) {
		/**
		 * 会员卡号 身份证号 手机号 卡号 60060825/03003544/130005478 身份证号
		 * 130102198201090668/110105197205294159/11010319780522061X 手机号
		 * 15808084597/18610093073/13436154688
		 * 60060825 130102198201090668 15808084597
		 */
		
		//门店 201 小票 	483	收音机 10072	50
		List<Object> ps=new ArrayList<Object>();
		ps.add("1");
		ps.add("60060825");//h会员号
		ps.add("201");//门店
		ps.add("483");//小票
		ps.add("10072");//收银
		ps.add(100);//销售金额
		Message map=sendws.send6011(ps);
		System.out.println(map);
	}
	private static Message send6010(List<Object> ps) {
		// TODO Auto-generated method stub
		
		String [] in6010={"60021151","",""};
		return send(userid,password,cmdid6010,arry2str(in6010));
	}
	private static Message send6011(List<Object> ps) {
		// TODO Auto-generated method stub
		
		return send(userid,password,cmdid6010,arry2str(ps.toArray()));
	}
}
