package cn.ebatech.imixpark.common.model.user;

import java.util.Date;

/**
 * 消费
 * @author tanyougen
 *
 */
public class Consumption {
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
	
}
