package cn.ebatech.imixpark.market.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * 商品表实体类
 * @author dell
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Commodity implements Serializable {

    @NotNull
    @Min(1L)
    private Long id;
    private String commodity_name;
    private String commodity_code;
    private String commodity_attr;
    private String commodity_price;
    private String item_no;
    
    @Override
    public String toString() {
        return "Commodity (" +
        		"id=" + id + ", " +
        		"commodity_name='" + commodity_name + "', " +
        		"commodity_code='"+commodity_code+"', " +
        		"commodity_attr='"+commodity_attr+"', " +
        		"commodity_price='"+commodity_price+"', " +
        		"item_no='"+item_no+"'" +
        		")";
    }

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCommodity_name() {
		return commodity_name;
	}

	public void setCommodity_name(String commodity_name) {
		this.commodity_name = commodity_name;
	}

	public String getCommodity_code() {
		return commodity_code;
	}

	public void setCommodity_code(String commodity_code) {
		this.commodity_code = commodity_code;
	}

	public String getCommodity_attr() {
		return commodity_attr;
	}

	public void setCommodity_attr(String commodity_attr) {
		this.commodity_attr = commodity_attr;
	}

	public String getCommodity_price() {
		return commodity_price;
	}

	public void setCommodity_price(String commodity_price) {
		this.commodity_price = commodity_price;
	}

	public String getItem_no() {
		return item_no;
	}

	public void setItem_no(String item_no) {
		this.item_no = item_no;
	}

}
