package cn.ebatech.imixpark.market.model;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Coupons implements Serializable{
	private static final long serialVersionUID = 1L;
	@NotNull
	@Min(value=1)
	private int 	coupon_id;
	private int 	category_id;
	private int 	merchant_id;
	private String	couponcode;
	private int 	category;
	private double 	amount;
	private double 	lowest_amount;
	private Date 	end_time;
	public int getCoupon_id() {
		return coupon_id;
	}
	public void setCoupon_id(int coupon_id) {
		this.coupon_id = coupon_id;
	}
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public int getMerchant_id() {
		return merchant_id;
	}
	public void setMerchant_id(int merchant_id) {
		this.merchant_id = merchant_id;
	}
	public String getCouponcode() {
		return couponcode;
	}
	public void setCouponcode(String couponcode) {
		this.couponcode = couponcode;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getLowest_amount() {
		return lowest_amount;
	}
	public void setLowest_amount(double lowest_amount) {
		this.lowest_amount = lowest_amount;
	}
	public Date getEnd_time() {
		return end_time;
	}
	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}
	public String getUse_limit() {
		return use_limit;
	}
	public void setUse_limit(String use_limit) {
		this.use_limit = use_limit;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private String 	use_limit;
	
}
