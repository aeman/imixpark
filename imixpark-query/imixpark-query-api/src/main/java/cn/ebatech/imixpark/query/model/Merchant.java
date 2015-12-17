package cn.ebatech.imixpark.query.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * 商户表实体类
 * @author dell
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Merchant implements Serializable {

    @NotNull
    @Min(1L)
    private Long id;
    private String merchant_name;
    private String merchant_code;
    private String account_number;
    private String merchant_address;
    private String merchant_phone;
    
    @Override
    public String toString() {
        return "Merchant (" +
        		"id=" + id + ", " +
        		"merchant_name='" + merchant_name + "', " +
        		"merchant_code='"+merchant_code+"', " +
        		"account_number='"+account_number+"', " +
        		"merchant_address='"+merchant_address+"', " +
        		"merchant_phone='"+merchant_phone+"'" +
        		")";
    }

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMerchant_name() {
		return merchant_name;
	}

	public void setMerchant_name(String merchant_name) {
		this.merchant_name = merchant_name;
	}

	public String getMerchant_code() {
		return merchant_code;
	}

	public void setMerchant_code(String merchant_code) {
		this.merchant_code = merchant_code;
	}

	public String getAccount_number() {
		return account_number;
	}

	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}

	public String getMerchant_address() {
		return merchant_address;
	}

	public void setMerchant_address(String merchant_address) {
		this.merchant_address = merchant_address;
	}

	public String getMerchant_phone() {
		return merchant_phone;
	}

	public void setMerchant_phone(String merchant_phone) {
		this.merchant_phone = merchant_phone;
	}

	
}
