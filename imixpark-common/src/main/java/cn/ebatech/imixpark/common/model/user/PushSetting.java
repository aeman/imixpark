package cn.ebatech.imixpark.common.model.user;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 消息推送设置表实体类
 * @author XLJIANG
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class PushSetting implements Serializable{
	private static final long serialVersionUID = -8099128865555197852L;
	private Long push_id;				//主键ID
	private Long user_id;				//用户ID
	private String activity_open_flag;	//活动消息开关（0关闭 1开启）
	private String system_open_flag;	//系统消息开关（0关闭 1开启）
	
	public PushSetting() {
	}

	public PushSetting(Long push_id, Long user_id, String activity_open_flag,
			String system_open_flag) {
		this.push_id = push_id;
		this.user_id = user_id;
		this.activity_open_flag = activity_open_flag;
		this.system_open_flag = system_open_flag;
	}

	public Long getPush_id() {
		return push_id;
	}

	public void setPush_id(Long push_id) {
		this.push_id = push_id;
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public String getActivity_open_flag() {
		return activity_open_flag;
	}

	public void setActivity_open_flag(String activity_open_flag) {
		this.activity_open_flag = activity_open_flag;
	}

	public String getSystem_open_flag() {
		return system_open_flag;
	}

	public void setSystem_open_flag(String system_open_flag) {
		this.system_open_flag = system_open_flag;
	}
	
}
