package cn.ebatech.imixpark.common.model.user;

public class uMessage {

	private int code;
	private String message;
	private User user;

	private int totalPages = 1; // 总页数
	private int pageSize = 5; // 每页记录数
	private int totalRecords = 0; // 总记录数

	public uMessage(int success, String string) {
		// TODO Auto-generated constructor stub
		this.code = success;
		this.message = string;
	}

	public static uMessage findMsg() {
		return new uMessage(1, "操作成功！");
	}

	public uMessage() {
		// TODO Auto-generated constructor stub
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(int totalRecords) {
		if (totalRecords < 0) {
			throw new RuntimeException("总记录数不能小于0!");
		}
		// 设置总记录数
		this.totalRecords = totalRecords;
		// 计算总页数
		this.totalPages = this.totalRecords / this.pageSize;
		if (this.totalRecords % this.pageSize != 0) {
			this.totalPages++;
		}

	}


	public int getTotalPages() {
		return totalPages;
	}


}
