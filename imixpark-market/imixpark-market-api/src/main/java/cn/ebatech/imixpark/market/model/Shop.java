package cn.ebatech.imixpark.market.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * 商铺表实体类
 * @author dell
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Shop implements Serializable {

    @NotNull
    @Min(1L)
    private Long id;
    private String shop_name;
    
    @Override
    public String toString() {
        return "Shop (" +
        		"id=" + id + ", " +
        		"shop_name='" + shop_name + "', " +
        		")";
    }

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getShop_name() {
		return shop_name;
	}

	public void setShop_name(String shop_name) {
		this.shop_name = shop_name;
	}

}
