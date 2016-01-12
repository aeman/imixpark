package cn.ebatech.imixpark.common.model.user;

import java.util.Date;

/**
 * 积分日志
 * 
 * @author tanyougen
 *
 */
public class LogIntegral {
	private String	 cdltype	    ;//卡类别
	private String	 cdlmkt	    ;//发生门店
	private String	 cdlcno	    ;//会员卡号
	private String	 cdlcid	    ;//会员帐号
	private String	 cdlcmkt	    ;//卡所属门店
	private String	 cdlmcard	;//是否主卡
	private String	 cdlflag	    ;//发生时状态
	private String	 cdltrans	;//事务摘要
	private  Date  	 cdldate	;//10	发生日期
	private String	 cdlbillno	;//单据编号
	private String	 cdlbillid	;//单据类型
	private String	 cdloperid	;//操作者
	private  String	 cdlmemo	    ;//说明
	private String	 cdlsyjid	;//收银机号
	private String	 cdlinvno	;//小票号
	private double	 cdltrace	;//流水号
	private double	 cdlxfje	    ;//消费金额
	private double	 cdlzkje	    ;//折扣金额
	private double	 cdlcurjffs	;//当期积分发生额
	private double	 cdlhisjffs	;//历史积分发生额
	private double	 cdlcurjfye	;//当期积分余额
	private double	 cdlhisjfye	;//历史积分余额
	private double	 cdltotjfye	;//总积分余额
	private double	 cdlcurxfje	;//当期消费金额
	private double	 cdlhisxfje	;//历史消费金额
	private double	 cdltotxfje	;//总消费金额
	private 	Date cdlvaliddate;//28	积分有效期，预留功能
	private Date	 cdldate1	;//
	private Date	 cdlDate2	;//
	private Date	 cdldate3	;//
	private double	 cdlnum1	    ;//
	private double	 cdlnum2	    ;//
	private double	 cdlnum3	    ;//
	private double	 cdlnum4	    ;//
	private double	 cdlnum5	    ;//
	public String getCdltype() {
		return cdltype;
	}
	public void setCdltype(String cdltype) {
		this.cdltype = cdltype;
	}
	public String getCdlmkt() {
		return cdlmkt;
	}
	public void setCdlmkt(String cdlmkt) {
		this.cdlmkt = cdlmkt;
	}
	public String getCdlcno() {
		return cdlcno;
	}
	public void setCdlcno(String cdlcno) {
		this.cdlcno = cdlcno;
	}
	public String getCdlcid() {
		return cdlcid;
	}
	public void setCdlcid(String cdlcid) {
		this.cdlcid = cdlcid;
	}
	public String getCdlcmkt() {
		return cdlcmkt;
	}
	public void setCdlcmkt(String cdlcmkt) {
		this.cdlcmkt = cdlcmkt;
	}
	public String getCdlmcard() {
		return cdlmcard;
	}
	public void setCdlmcard(String cdlmcard) {
		this.cdlmcard = cdlmcard;
	}
	public String getCdlflag() {
		return cdlflag;
	}
	public void setCdlflag(String cdlflag) {
		this.cdlflag = cdlflag;
	}
	public String getCdltrans() {
		return cdltrans;
	}
	public void setCdltrans(String cdltrans) {
		this.cdltrans = cdltrans;
	}
	public Date getCdldate() {
		return cdldate;
	}
	public void setCdldate(Date cdldate) {
		this.cdldate = cdldate;
	}
	public String getCdlbillno() {
		return cdlbillno;
	}
	public void setCdlbillno(String cdlbillno) {
		this.cdlbillno = cdlbillno;
	}
	public String getCdlbillid() {
		return cdlbillid;
	}
	public void setCdlbillid(String cdlbillid) {
		this.cdlbillid = cdlbillid;
	}
	public String getCdloperid() {
		return cdloperid;
	}
	public void setCdloperid(String cdloperid) {
		this.cdloperid = cdloperid;
	}
	public String getCdlmemo() {
		return cdlmemo;
	}
	public void setCdlmemo(String cdlmemo) {
		this.cdlmemo = cdlmemo;
	}
	public String getCdlsyjid() {
		return cdlsyjid;
	}
	public void setCdlsyjid(String cdlsyjid) {
		this.cdlsyjid = cdlsyjid;
	}
	public String getCdlinvno() {
		return cdlinvno;
	}
	public void setCdlinvno(String cdlinvno) {
		this.cdlinvno = cdlinvno;
	}
	public double getCdltrace() {
		return cdltrace;
	}
	public void setCdltrace(double cdltrace) {
		this.cdltrace = cdltrace;
	}
	public double getCdlxfje() {
		return cdlxfje;
	}
	public void setCdlxfje(double cdlxfje) {
		this.cdlxfje = cdlxfje;
	}
	public double getCdlzkje() {
		return cdlzkje;
	}
	public void setCdlzkje(double cdlzkje) {
		this.cdlzkje = cdlzkje;
	}
	public double getCdlcurjffs() {
		return cdlcurjffs;
	}
	public void setCdlcurjffs(double cdlcurjffs) {
		this.cdlcurjffs = cdlcurjffs;
	}
	public double getCdlhisjffs() {
		return cdlhisjffs;
	}
	public void setCdlhisjffs(double cdlhisjffs) {
		this.cdlhisjffs = cdlhisjffs;
	}
	public double getCdlcurjfye() {
		return cdlcurjfye;
	}
	public void setCdlcurjfye(double cdlcurjfye) {
		this.cdlcurjfye = cdlcurjfye;
	}
	public double getCdlhisjfye() {
		return cdlhisjfye;
	}
	public void setCdlhisjfye(double cdlhisjfye) {
		this.cdlhisjfye = cdlhisjfye;
	}
	public double getCdltotjfye() {
		return cdltotjfye;
	}
	public void setCdltotjfye(double cdltotjfye) {
		this.cdltotjfye = cdltotjfye;
	}
	public double getCdlcurxfje() {
		return cdlcurxfje;
	}
	public void setCdlcurxfje(double cdlcurxfje) {
		this.cdlcurxfje = cdlcurxfje;
	}
	public double getCdlhisxfje() {
		return cdlhisxfje;
	}
	public void setCdlhisxfje(double cdlhisxfje) {
		this.cdlhisxfje = cdlhisxfje;
	}
	public double getCdltotxfje() {
		return cdltotxfje;
	}
	public void setCdltotxfje(double cdltotxfje) {
		this.cdltotxfje = cdltotxfje;
	}
	public Date getCdlvaliddate() {
		return cdlvaliddate;
	}
	public void setCdlvaliddate(Date cdlvaliddate) {
		this.cdlvaliddate = cdlvaliddate;
	}
	public Date getCdldate1() {
		return cdldate1;
	}
	public void setCdldate1(Date cdldate1) {
		this.cdldate1 = cdldate1;
	}
	public Date getCdlDate2() {
		return cdlDate2;
	}
	public void setCdlDate2(Date cdlDate2) {
		this.cdlDate2 = cdlDate2;
	}
	public Date getCdldate3() {
		return cdldate3;
	}
	public void setCdldate3(Date cdldate3) {
		this.cdldate3 = cdldate3;
	}
	public double getCdlnum1() {
		return cdlnum1;
	}
	public void setCdlnum1(double cdlnum1) {
		this.cdlnum1 = cdlnum1;
	}
	public double getCdlnum2() {
		return cdlnum2;
	}
	public void setCdlnum2(double cdlnum2) {
		this.cdlnum2 = cdlnum2;
	}
	public double getCdlnum3() {
		return cdlnum3;
	}
	public void setCdlnum3(double cdlnum3) {
		this.cdlnum3 = cdlnum3;
	}
	public double getCdlnum4() {
		return cdlnum4;
	}
	public void setCdlnum4(double cdlnum4) {
		this.cdlnum4 = cdlnum4;
	}
	public double getCdlnum5() {
		return cdlnum5;
	}
	public void setCdlnum5(double cdlnum5) {
		this.cdlnum5 = cdlnum5;
	}
	@Override
	public String toString() {
		return "LogIntegral [cdltype=" + cdltype + ", cdlmkt=" + cdlmkt
				+ ", cdlcno=" + cdlcno + ", cdlcid=" + cdlcid + ", cdlcmkt="
				+ cdlcmkt + ", cdlmcard=" + cdlmcard + ", cdlflag=" + cdlflag
				+ ", cdltrans=" + cdltrans + ", cdldate=" + cdldate
				+ ", cdlbillno=" + cdlbillno + ", cdlbillid=" + cdlbillid
				+ ", cdloperid=" + cdloperid + ", cdlmemo=" + cdlmemo
				+ ", cdlsyjid=" + cdlsyjid + ", cdlinvno=" + cdlinvno
				+ ", cdltrace=" + cdltrace + ", cdlxfje=" + cdlxfje
				+ ", cdlzkje=" + cdlzkje + ", cdlcurjffs=" + cdlcurjffs
				+ ", cdlhisjffs=" + cdlhisjffs + ", cdlcurjfye=" + cdlcurjfye
				+ ", cdlhisjfye=" + cdlhisjfye + ", cdltotjfye=" + cdltotjfye
				+ ", cdlcurxfje=" + cdlcurxfje + ", cdlhisxfje=" + cdlhisxfje
				+ ", cdltotxfje=" + cdltotxfje + ", cdlvaliddate="
				+ cdlvaliddate + ", cdldate1=" + cdldate1 + ", cdlDate2="
				+ cdlDate2 + ", cdldate3=" + cdldate3 + ", cdlnum1=" + cdlnum1
				+ ", cdlnum2=" + cdlnum2 + ", cdlnum3=" + cdlnum3
				+ ", cdlnum4=" + cdlnum4 + ", cdlnum5=" + cdlnum5 + "]";
	}
	
	

}