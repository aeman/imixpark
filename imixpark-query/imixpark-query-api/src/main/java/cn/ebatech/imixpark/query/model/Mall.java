package cn.ebatech.imixpark.query.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * 商场表实体类
 * @author dell
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Mall implements Serializable {

    @NotNull
    @Min(1L)
    private Long id;
    private String mall_name;
    private String mall_address;
    private String mall_phone;
    private String legal_person;
    
    @Override
    public String toString() {
        return "Mall (" +
        		"id=" + id + ", " +
        		"mall_name='" + mall_name + "', " +
        		"mall_address='"+mall_address+"', " +
        		"mall_phone='"+mall_phone+"', " +
        		"legal_person='"+legal_person+"', " +
        		")";
    }

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMall_name() {
		return mall_name;
	}

	public void setMall_name(String mall_name) {
		this.mall_name = mall_name;
	}

	public String getMall_address() {
		return mall_address;
	}

	public void setMall_address(String mall_address) {
		this.mall_address = mall_address;
	}

	public String getMall_phone() {
		return mall_phone;
	}

	public void setMall_phone(String mall_phone) {
		this.mall_phone = mall_phone;
	}

	public String getLegal_person() {
		return legal_person;
	}

	public void setLegal_person(String legal_person) {
		this.legal_person = legal_person;
	}

}
