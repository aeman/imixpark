package cn.ebatech.imixpark.user.webService_fj;

import java.util.Date;

import javax.xml.ws.Holder;

import org.junit.Before;
import org.junit.Test;

public class test {
	public static String userid = "O2O1";
	public static String password = "AD560A78A9E29F8B";
	public static String cmdid6001 = "6001";
	public static String cmdid6002 = "6002";
	public static String cmdid6003 = "6003";
	public static String cmdid6004 = "6004";
	public static String cmdid6005 = "6005";
	public static String cmdid6006 = "6006";
	public static String cmdid6007 = "6007";
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

	public static Holder<String> outputpara = new Holder<String>();
	public static Holder<Integer> rtn = new Holder<Integer>();
	public static Holder<String> errormsg = new Holder<String>();
	public static Holder<Short> processdataResult = new Holder<Short>();
	private NFrdif nfridf;
	private NFrdifSoap soap;

	public static void main2(String[] args) {
		/**
		 * 会员卡号 身份证号 手机号 卡号 60060825/03003544/130005478 身份证号
		 * 130102198201090668/110105197205294159/11010319780522061X 手机号
		 * 15808084597/18610093073/13436154688
		 */
		NFrdif s = new NFrdif();
		NFrdifSoap ss = s.getNFrdifSoap();

	}
	/**
	 * 1.会员验证
	 * 参数 会员卡号 身份证号 手机号
	 * 返回值 成功标识 提示信息 实际卡号
	 */
	@Test
	public void test6001() {
		System.out.println(arry2str(inputpara6001));
		// send(cmdid6001,inputpara6001.toString());
	}
	/**
	 * 会员注册
	 * 参数 手机号码 身份证号 会员姓名 性别 （0：男；1：女）（可选）
	 * 返回值  成功标识(0 失败 1 成功 ) 提示信息, 卡号, 卡类型, 手机号, 身份证号, 会员ID
	 */
	@Test
	public void test6002() {
		send(cmdid6002, arry2str(inputpara6002));
	}
	/**
	 * 会员信息查询
	 * 参数 查询方式 查询条件
	 * 返回值 成功标识,提示信息,会员账号，卡号,姓名，卡类型 ,卡类型名称，是否有积分账户,
	 *     是否可以会员折扣, 当前有效积分, 有效期, 电话, 身份证号, 性别, 生日, 地址, 维护门店,
	 */
	@Test
	public void test6003() {
		send(cmdid6003, arry2str(inputpara6003));
	}
	/**
	 * 积分增减
	 * 参数 会员卡号, 积分值, 积分处理类型, 门店代码, 流水号
	 * 返回值  成功标识, 提示信息, 会员账号, 卡号, 姓名, 卡类型, 卡类型名称, 是否有积分账户,
	 *      是否可以会员折扣, 当前有效积分, 有效期, 电话, 身份证号, 性别, 邮箱, 生日, 地址, 维护门店
	 */
	@Test
	public void test6004() {
		send(cmdid6004, arry2str(inputpara6004));
	}
	/**
	 * 会员账户积分查询
	 * 参数 会员卡号, 身份证号, 手机号,
	 * 返回值 成功标识， 提示信息， 积分余额
	 */
	@Test
	public void test6005() {
		inputpara6005[0]="60060825";
		send(cmdid6005, arry2str(inputpara6005));
		
	}
	/**
	 * 消费记录查询
	 * 会员卡号， 身份证号， 手机号
	 * 返回值 成功标识， 提示信息， 日志序列号， 门店名称， 卡号， 事物名称，
		发生日期， 收银机号， 小票号， 柜组名称， 商品编码， 商品名称， 成交金额， 积分
	 */
	@Test
	public void test6006() {
		inputpara6006[0]=vipno;
		inputpara6006[1]=shenfno;
		inputpara6006[2]=phoneno;
		send(cmdid6006, arry2str(inputpara6006));
	}
	/**
	 * 会员信息更改
	 * 参数 会员卡号， 手机号， 出生日期， 性别， 地址， 邮箱
	 * 返回值 成功标识， 提示信息
	 */
	@Test
	public void test6007() {
		inputpara6007[0]=vipno;
		inputpara6007[1]=phoneno;
		inputpara6007[2]="1923/12/12";
		inputpara6007[3]="1";
		inputpara6007[4]="长安街天安门1号";
		inputpara6007[5]="tanni4j@163.com";
		send(cmdid6007, arry2str(inputpara6007));
	}

	public void send(String cmdid, String inputpara) {
		this.soap.processdata(userid, password, cmdid, inputpara, outputpara,
				rtn, errormsg, processdataResult);
		myprint();
	}

	@Before
	public void before() {
		this.nfridf = new NFrdif();
		this.soap = this.nfridf.getNFrdifSoap();
		System.out.println("before");
	}

	public void myprint() {
		System.out.println(processdataResult.value);
		System.out.println(rtn.value);
		System.out.println(errormsg.value);
		System.out.println(outputpara.value);
		return;
		/*System.out.println(outputpara.value.split("\t").length);
		String s[]=outputpara.value.split("\t");
		for (String string : s) {
			System.out.println(string);
		}*/
	}

	public String arry2str(String[] ary) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < ary.length; i++) {
			
			if(i==ary.length-1){
				sb.append(ary[i].trim());
			}else{
				sb.append(ary[i].trim() + ",");
			}
			
		}
		String newStr = sb.toString();
		return newStr;
	}
}
