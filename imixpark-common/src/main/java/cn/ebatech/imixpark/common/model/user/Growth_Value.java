package cn.ebatech.imixpark.common.model.user;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 成长值记录表实体
 * @author XLJIANG
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Growth_Value implements Serializable{
	private static final long serialVersionUID = 7400850038314633505L;
	private Long growth_id ;	//商场ID
    private Long user_id;		//商场编码
    private String growth_type;	//商场名称
    private int growth_count;	//商场地址
    private Date growth_time;	//创建时间
    
    public Growth_Value() {
    }

	public Growth_Value(Long growth_id, Long user_id, String growth_type,
			int growth_count, Date growth_time) {
		this.growth_id = growth_id;
		this.user_id = user_id;
		this.growth_type = growth_type;
		this.growth_count = growth_count;
		this.growth_time = growth_time;
	}

	public Long getGrowth_id() {
		return growth_id;
	}

	public void setGrowth_id(Long growth_id) {
		this.growth_id = growth_id;
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public String getGrowth_type() {
		return growth_type;
	}

	public void setGrowth_type(String growth_type) {
		this.growth_type = growth_type;
	}

	public int getGrowth_count() {
		return growth_count;
	}

	public void setGrowth_count(int growth_count) {
		this.growth_count = growth_count;
	}

	public Date getGrowth_time() {
		return growth_time;
	}

	public void setGrowth_time(Date growth_time) {
		this.growth_time = growth_time;
	}

}
