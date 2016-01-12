package cn.ebatech.imixpark.common.model.user;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 会员卡
 * 
 * @author tanyougen
 *
 */
public class VIPCard {
	/**
	 * 会员账号	Varchar2(20)
卡号	Varchar2(20)
姓名	VARCHAR2(100)
卡类型	Varchar2(4)
卡类型名称	VARCHAR2(60)
是否有积分账户	number
是否可以会员折扣	number
当前有效积分	number
有效期	date
电话	Varchar(30)
身份证号	Varchar(20)
性别	Char(1) M:男  F:女
邮箱	Varchar(100)
生日	date
地址	Varchar(200)
维护门店	Varchar(20)
	 */
	/****************富基******************/
	private String account;
	private String number;
	private String name;
	private String type;
	private String typeName;
	private int isHaveIntegral;
	private int isDiscount;
	private double Integral;
	private Date periodOfValidity;
	private Date birthday;
	private String phoneNo;
	private String IDnumber;
	private String sex;
	private String email;
	private String address;
	private String store;
	/***************富基 end*******************/
	//成长值区间
	private String valueSection;
	
	/**
	 * 会员等级
	 */
	private String vipGrade;
	 
	private int userID;
	
	public VIPCard(String[] msArray) throws ParseException {
		 
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
			this.account=msArray[2];
			this.number=msArray[3];
			this.name=msArray[4];
			this.type=msArray[5];
			this.typeName=msArray[6];
			this.isHaveIntegral=Integer.valueOf(msArray[7]);
			this.isDiscount=Integer.valueOf(msArray[8]);
			this.Integral=Double.valueOf(msArray[9]);
			this.periodOfValidity=sdf.parse(msArray[10]);
			this.phoneNo=msArray[11];
			this.IDnumber=msArray[12];
			this.sex=msArray[13];
			this.email=msArray[14];
			this.birthday=sdf.parse(msArray[15]);
			this.address=msArray[16];
			this.store=msArray[17];
		
	}
	public String getVipGrade() {
		return vipGrade;
	}
	public void setVipGrade(String vipGrade) {
		this.vipGrade = vipGrade;
	}
	public String getValueSection() {
		return valueSection;
	}
	public void setValueSection(String valueSection) {
		this.valueSection = valueSection;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public int getIsHaveIntegral() {
		return isHaveIntegral;
	}
	public void setIsHaveIntegral(int isHaveIntegral) {
		this.isHaveIntegral = isHaveIntegral;
	}
	public int getIsDiscount() {
		return isDiscount;
	}
	public void setIsDiscount(int isDiscount) {
		this.isDiscount = isDiscount;
	}
	public double getIntegral() {
		return Integral;
	}
	public void setIntegral(int integral) {
		Integral = integral;
	}
	public Date getPeriodOfValidity() {
		return periodOfValidity;
	}
	public void setPeriodOfValidity(Date periodOfValidity) {
		this.periodOfValidity = periodOfValidity;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getIDnumber() {
		return IDnumber;
	}
	public void setIDnumber(String iDnumber) {
		IDnumber = iDnumber;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStore() {
		return store;
	}
	public void setStore(String store) {
		this.store = store;
	}
	
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public void setIntegral(double integral) {
		Integral = integral;
	}
}
