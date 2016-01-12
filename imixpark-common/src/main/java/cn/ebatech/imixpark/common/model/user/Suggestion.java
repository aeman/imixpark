package cn.ebatech.imixpark.common.model.user;

import java.sql.Timestamp;


public class Suggestion {
	
	private int id;
	/**
	 * 用户意见
	 */
	private  String Context;
	/**
	 * 用户电话
	 */
	private  String Tel;

	private  Timestamp CreatDate;
	
	public Timestamp getCreatDate() {
		return CreatDate;
	}
	public void setCreatDate(Timestamp creatDate) {
		CreatDate = creatDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContext() {
		return Context;
	}
	public void setContext(String context) {
		Context = context;
	}
	public String getTel() {
		return Tel;
	}
	public void setTel(String tel) {
		Tel = tel;
	}

}
