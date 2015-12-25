package cn.ebatech.imixpark.common.model.user;

import java.util.Date;

/**
 * 积分
 * 
 * @author tanyougen
 *
 */
public class Integral {
	/**
	 * id
	 */
	private int Integral_Id;
	/**
	 * 积分来源
	 */
	private String Integral_Source;
	/**
	 * 商城名字
	 */
	private String Mall_Name;
	/**
	 * 积分数
	 */
	private int Sintegral_Score;
	/**
	 * 订单id
	 */
	private String OrderID;
	/**
	 * 创建时间
	 */
	private Date createDate;
	/**
	 * 描述
	 */
	private String describe;
	/**
	 * 商铺id
	 */
	private String ShopId;
	/*
	 * 用户
	 */
	private User user;
	/*
	 * 用户
	 */
	private String userID;

	public String getOrderID() {
		return OrderID;
	}

	public void setOrderID(String orderID) {
		OrderID = orderID;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getIntegral_Id() {
		return Integral_Id;
	}

	public void setIntegral_Id(int integral_Id) {
		Integral_Id = integral_Id;
	}

	public String getIntegral_Source() {
		return Integral_Source;
	}

	public void setIntegral_Source(String integral_Source) {
		Integral_Source = integral_Source;
	}

	public String getMall_Name() {
		return Mall_Name;
	}

	public void setMall_Name(String mall_Name) {
		Mall_Name = mall_Name;
	}

	public int getSintegral_Score() {
		return Sintegral_Score;
	}

	public void setSintegral_Score(int sintegral_Score) {
		Sintegral_Score = sintegral_Score;
	}

}