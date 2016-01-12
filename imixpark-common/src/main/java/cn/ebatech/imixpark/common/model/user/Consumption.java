package cn.ebatech.imixpark.common.model.user;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 消费
 * @author tanyougen
 *
 */
public class Consumption {
	/**
	 * 消费记录ID
消费商户名称
商品ID
会员ID
消费金额
支付类型
是否使用积分
是否使用优惠券
创建时间
优惠券券号
订单ID
描述
消费商户
	 */
	/**
	 * id
	 */
	private int Cp_Id; 
	/**
	 * 此次消费的(会员)用户
	 */
	private int Cp_User_Id;
	/**
	 * 消费项目
	 */
	private String Cp_Item;
	/**
	 * 消费金额
	 */
	private double Cp_Amount;
	/**
	 * 付款渠道
	 */
	private String Cp_Channel;

	/**
	 * 商户名称
	 */
	private String Cp_Seller_name;
	/**
	 * 消费时间
	 */
	private Date Cp_Datetime;
	/**
	 * 订单号
	 */
	private String OrderID;
	/**
	 * 描述
	 */
	private String describe;
	/**
	 * 商铺id
	 */
	private String ShopId;
	/**
	 * 商铺名称
	 */
	private String ShopName;
	
	/*****************************fuji*************************/
	/*
	门店名称 ShopName;
	卡号 ShopNo
	事物名称 ThingName
	发生日期 careteTime
	收银机号 posID
	小票号  invoiceNo
	柜组名称 groupName;
	商品编码 commodityNo
	商品名称 commodityName;
	成交金额 money
	积分 Integral
	 */
	private String shopName;
	private String shopNo;
	private String thingName;
	private Date careteTime;
	private String posID;
	private String invoiceNo;
	private String groupName;
	private String commodityNo;
	private String commodityName;
	private double  money;
	private  double Integral;
	
	public Consumption(String[] split) throws ParseException {
		SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd"); 
		this.shopName=split[1];
		this.shopNo=split[2];
		this.thingName=split[3];
		this.careteTime=fm.parse(split[4]);
		this.posID=split[5];
		this.invoiceNo=split[6];
		this.groupName=split[7];
		this.commodityNo=split[8];
		this.commodityName=split[9];
		this.money=Double.valueOf(split[10]);
		this.Integral=Double.valueOf(split[11]);
	}
	public String getShopNo() {
		return shopNo;
	}
	public void setShopNo(String shopNo) {
		this.shopNo = shopNo;
	}
	public String getThingName() {
		return thingName;
	}
	public void setThingName(String thingName) {
		this.thingName = thingName;
	}
	public Date getCareteTime() {
		return careteTime;
	}
	public void setCareteTime(Date careteTime) {
		this.careteTime = careteTime;
	}
	public String getPosID() {
		return posID;
	}
	public void setPosID(String posID) {
		this.posID = posID;
	}
	public String getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getCommodityNo() {
		return commodityNo;
	}
	public void setCommodityNo(String commodityNo) {
		this.commodityNo = commodityNo;
	}
	public String getCommodityName() {
		return commodityName;
	}
	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public double getIntegral() {
		return Integral;
	}
	public void setIntegral(double integral) {
		Integral = integral;
	}

	/*****************************fuji end*************************/
	
	private String UserId;
	
	public String getOrderID() {
		return OrderID;
	}
	public void setOrderID(String orderID) {
		OrderID = orderID;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public String getShopId() {
		return ShopId;
	}
	public void setShopId(String shopId) {
		ShopId = shopId;
	}
	public String getShopName() {
		return ShopName;
	}
	public void setShopName(String shopName) {
		ShopName = shopName;
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public int getCp_Id() {
		return Cp_Id;
	}
	public void setCp_Id(int cp_Id) {
		Cp_Id = cp_Id;
	}
	public int getCp_User_Id() {
		return Cp_User_Id;
	}
	public void setCp_User_Id(int cp_User_Id) {
		Cp_User_Id = cp_User_Id;
	}
	public String getCp_Item() {
		return Cp_Item;
	}
	public void setCp_Item(String cp_Item) {
		Cp_Item = cp_Item;
	}
	public double getCp_Amount() {
		return Cp_Amount;
	}
	public void setCp_Amount(double cp_Amount) {
		Cp_Amount = cp_Amount;
	}
	public String getCp_Channel() {
		return Cp_Channel;
	}
	public void setCp_Channel(String cp_Channel) {
		Cp_Channel = cp_Channel;
	}
	public String getCp_Seller_name() {
		return Cp_Seller_name;
	}
	public void setCp_Seller_name(String cp_Seller_name) {
		Cp_Seller_name = cp_Seller_name;
	}
	public Date getCp_Datetime() {
		return Cp_Datetime;
	}
	public void setCp_Datetime(Date cp_Datetime) {
		Cp_Datetime = cp_Datetime;
	}
	
	/********************test*************************/
	private String id;
	private String name;
	private Date createTime;
	private String userID;
	

	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	
}
