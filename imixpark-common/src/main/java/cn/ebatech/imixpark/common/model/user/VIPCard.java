package cn.ebatech.imixpark.common.model.user;

import java.util.Date;

/**
 * 会员卡
 * 
 * @author tanyougen
 *
 */
public class VIPCard {
	/**
	 * 所属用户
	 */
	private User user;
	/**
	 * 会员等级
	 */
	private String Card_Level;
	/**
	 * 会员成长值最小值
	 */
	private int Level_Min_Value;
	/**
	 * 会员成长值最大值
	 */
	private int Level_Max_Value;
	/**
	 * 状态
	 */
	private String Card_State;
	/**
	 * 备注
	 */
	private String Card_Remark;

	/*******************************************************/

	private int Card_Id;// 会员账号 唯一id
	private String Typectcode;// 卡类型
	private String Ctjfrate;// 是否有积分账户
	private String Ctname;// 卡类型名称
	private String Ctzkl;// 是否可以会员折扣
	private String Ccusrjfye;// 当前有效积分
	private String Cmmoobile2;// 电话2
	private String Cmmoobile1;// 电话1
	private String Cmtel;// 电话
	private String Cmidno;// 卡号
	private String Cmsex;// 性别
	private String Cmemail;// 邮箱
	private Date Cmbirthday;// 生日
	private String Cdmmkt;// 维护门店
	private String Cmaddr;// 地址
	private Date Cdmmaxdate;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getCard_Level() {
		return Card_Level;
	}
	public void setCard_Level(String card_Level) {
		Card_Level = card_Level;
	}
	public int getLevel_Min_Value() {
		return Level_Min_Value;
	}
	public void setLevel_Min_Value(int level_Min_Value) {
		Level_Min_Value = level_Min_Value;
	}
	public int getLevel_Max_Value() {
		return Level_Max_Value;
	}
	public void setLevel_Max_Value(int level_Max_Value) {
		Level_Max_Value = level_Max_Value;
	}
	public String getCard_State() {
		return Card_State;
	}
	public void setCard_State(String card_State) {
		Card_State = card_State;
	}
	public String getCard_Remark() {
		return Card_Remark;
	}
	public void setCard_Remark(String card_Remark) {
		Card_Remark = card_Remark;
	}
	public int getCard_Id() {
		return Card_Id;
	}
	public void setCard_Id(int card_Id) {
		Card_Id = card_Id;
	}
	public String getTypectcode() {
		return Typectcode;
	}
	public void setTypectcode(String typectcode) {
		Typectcode = typectcode;
	}
	public String getCtjfrate() {
		return Ctjfrate;
	}
	public void setCtjfrate(String ctjfrate) {
		Ctjfrate = ctjfrate;
	}
	public String getCtname() {
		return Ctname;
	}
	public void setCtname(String ctname) {
		Ctname = ctname;
	}
	public String getCtzkl() {
		return Ctzkl;
	}
	public void setCtzkl(String ctzkl) {
		Ctzkl = ctzkl;
	}
	public String getCcusrjfye() {
		return Ccusrjfye;
	}
	public void setCcusrjfye(String ccusrjfye) {
		Ccusrjfye = ccusrjfye;
	}
	public String getCmmoobile2() {
		return Cmmoobile2;
	}
	public void setCmmoobile2(String cmmoobile2) {
		Cmmoobile2 = cmmoobile2;
	}
	public String getCmmoobile1() {
		return Cmmoobile1;
	}
	public void setCmmoobile1(String cmmoobile1) {
		Cmmoobile1 = cmmoobile1;
	}
	public String getCmtel() {
		return Cmtel;
	}
	public void setCmtel(String cmtel) {
		Cmtel = cmtel;
	}
	public String getCmidno() {
		return Cmidno;
	}
	public void setCmidno(String cmidno) {
		Cmidno = cmidno;
	}
	public String getCmsex() {
		return Cmsex;
	}
	public void setCmsex(String cmsex) {
		Cmsex = cmsex;
	}
	public String getCmemail() {
		return Cmemail;
	}
	public void setCmemail(String cmemail) {
		Cmemail = cmemail;
	}
	public Date getCmbirthday() {
		return Cmbirthday;
	}
	public void setCmbirthday(Date cmbirthday) {
		Cmbirthday = cmbirthday;
	}
	public String getCdmmkt() {
		return Cdmmkt;
	}
	public void setCdmmkt(String cdmmkt) {
		Cdmmkt = cdmmkt;
	}
	public String getCmaddr() {
		return Cmaddr;
	}
	public void setCmaddr(String cmaddr) {
		Cmaddr = cmaddr;
	}
	public Date getCdmmaxdate() {
		return Cdmmaxdate;
	}
	public void setCdmmaxdate(Date cdmmaxdate) {
		Cdmmaxdate = cdmmaxdate;
	}

	

}
