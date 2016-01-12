package cn.ebatech.imixpark.common.model.user;

import java.util.Date;
import java.util.List;

/**
 * 1.1.11商位
 * 
 * @author tanyougen
 *
 */
public class BaShop {

	private String id;// 系统编码
	private String spjm;// 商铺编码
	private String spname;// 商铺名称
	private String spename; // 商铺英文名称
	private String status; // 状态
	private String isvalid; // 是否有效
	private String str; // 门店
	private String floor;// 楼层
	private String regional;// 区域
	private String location;// 方位
	private String shape;// 形状
	private String length;// 长度
	private String easy; // 租赁难易
	private String spxz;// 广告类型
	private String zqjh;// 广告介质
	private String hygh;// 行业
	private String ytgh;// 业态
	private String zlgh;// 品牌
	private String kind;// 商铺类型
	private double jzarea; // 建筑面积
	private double syarea; // 实测面积
	private double zjarea; // 租金面积
	private String arealx; // 收楼标志
	private String rentdw; //
	private double rentts; //
	private double exprent; // 单位租金
	private double expsj; // 总租金
	private String currencies;//
	private double powerk; //
	private double powersl; //
	private String cablessize1; // 允许使用vip卡
	private double cablespcs1; //
	private String cablessize2; //
	private double cablespcs2; //
	private String cablessize3; // 品牌级别
	private double cablespcs3; // 推广费
	private String waterflg;//
	private String watermemo;//
	private double watersl; //
	private String watersize;// 是否专柜
	private String fcutype; // 是否重点关注
	private double fcusl; //
	private double fcurt; //
	private String airtype; //
	private double airsl; //
	private double airrt; //
	private String centertype;//
	private double centersl; //
	private double centerrt; //
	private String supplywh;// 租户事务协调
	private String returnwh;// 区域（燕莎奥莱用）
	private String kitflg;//
	private String kitwh;//
	private String kitmemo; //
	private double firesl1; //
	private double firesl2; //
	private double firesl3; //
	private double smokesl; //
	private String trapflg; //
	private double linesl1; //
	private double linesl2; //
	private double possl; //
	private String is_xssy; // 商铺辅助信息(a自持商铺b返租商铺c代租商铺d自有商铺)
	private String hth; // 合约号
	private String memo;// 备注
	private String oprid;// 录入人
	private String adtid;// 审核人
	private String postid; //
	private Date   last_modified;// Y 69 最后修改时间
	private String ssld;// 所属楼栋
	private String last_billid; // 最后修改单据id
	private String last_billno; // 最后修改单据
	private String last_operid; // 最后修改人
	private Date   oprDate; // 录入时间
	private Date   adtDate; // 审核时间
	private String source; // 来源（0：定义 1:拆分 2：合并）
	private String ismark; // 标记(1：拆分 2：合并)
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSpjm() {
		return spjm;
	}
	public void setSpjm(String spjm) {
		this.spjm = spjm;
	}
	public String getSpname() {
		return spname;
	}
	public void setSpname(String spname) {
		this.spname = spname;
	}
	public String getSpename() {
		return spename;
	}
	public void setSpename(String spename) {
		this.spename = spename;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getIsvalid() {
		return isvalid;
	}
	public void setIsvalid(String isvalid) {
		this.isvalid = isvalid;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public String getRegional() {
		return regional;
	}
	public void setRegional(String regional) {
		this.regional = regional;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public String getEasy() {
		return easy;
	}
	public void setEasy(String easy) {
		this.easy = easy;
	}
	public String getSpxz() {
		return spxz;
	}
	public void setSpxz(String spxz) {
		this.spxz = spxz;
	}
	public String getZqjh() {
		return zqjh;
	}
	public void setZqjh(String zqjh) {
		this.zqjh = zqjh;
	}
	public String getHygh() {
		return hygh;
	}
	public void setHygh(String hygh) {
		this.hygh = hygh;
	}
	public String getYtgh() {
		return ytgh;
	}
	public void setYtgh(String ytgh) {
		this.ytgh = ytgh;
	}
	public String getZlgh() {
		return zlgh;
	}
	public void setZlgh(String zlgh) {
		this.zlgh = zlgh;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public double getJzarea() {
		return jzarea;
	}
	public void setJzarea(double jzarea) {
		this.jzarea = jzarea;
	}
	public double getSyarea() {
		return syarea;
	}
	public void setSyarea(double syarea) {
		this.syarea = syarea;
	}
	public double getZjarea() {
		return zjarea;
	}
	public void setZjarea(double zjarea) {
		this.zjarea = zjarea;
	}
	public String getArealx() {
		return arealx;
	}
	public void setArealx(String arealx) {
		this.arealx = arealx;
	}
	public String getRentdw() {
		return rentdw;
	}
	public void setRentdw(String rentdw) {
		this.rentdw = rentdw;
	}
	public double getRentts() {
		return rentts;
	}
	public void setRentts(double rentts) {
		this.rentts = rentts;
	}
	public double getExprent() {
		return exprent;
	}
	public void setExprent(double exprent) {
		this.exprent = exprent;
	}
	public double getExpsj() {
		return expsj;
	}
	public void setExpsj(double expsj) {
		this.expsj = expsj;
	}
	public String getCurrencies() {
		return currencies;
	}
	public void setCurrencies(String currencies) {
		this.currencies = currencies;
	}
	public double getPowerk() {
		return powerk;
	}
	public void setPowerk(double powerk) {
		this.powerk = powerk;
	}
	public double getPowersl() {
		return powersl;
	}
	public void setPowersl(double powersl) {
		this.powersl = powersl;
	}
	public String getCablessize1() {
		return cablessize1;
	}
	public void setCablessize1(String cablessize1) {
		this.cablessize1 = cablessize1;
	}
	public double getCablespcs1() {
		return cablespcs1;
	}
	public void setCablespcs1(double cablespcs1) {
		this.cablespcs1 = cablespcs1;
	}
	public String getCablessize2() {
		return cablessize2;
	}
	public void setCablessize2(String cablessize2) {
		this.cablessize2 = cablessize2;
	}
	public double getCablespcs2() {
		return cablespcs2;
	}
	public void setCablespcs2(double cablespcs2) {
		this.cablespcs2 = cablespcs2;
	}
	public String getCablessize3() {
		return cablessize3;
	}
	public void setCablessize3(String cablessize3) {
		this.cablessize3 = cablessize3;
	}
	public double getCablespcs3() {
		return cablespcs3;
	}
	public void setCablespcs3(double cablespcs3) {
		this.cablespcs3 = cablespcs3;
	}
	public String getWaterflg() {
		return waterflg;
	}
	public void setWaterflg(String waterflg) {
		this.waterflg = waterflg;
	}
	public String getWatermemo() {
		return watermemo;
	}
	public void setWatermemo(String watermemo) {
		this.watermemo = watermemo;
	}
	public double getWatersl() {
		return watersl;
	}
	
	public Date getLast_modified() {
		return last_modified;
	}
	public void setLast_modified(Date last_modified) {
		this.last_modified = last_modified;
	}
	public void setWatersl(double watersl) {
		this.watersl = watersl;
	}
	public String getWatersize() {
		return watersize;
	}
	public void setWatersize(String watersize) {
		this.watersize = watersize;
	}
	public String getFcutype() {
		return fcutype;
	}
	public void setFcutype(String fcutype) {
		this.fcutype = fcutype;
	}
	public double getFcusl() {
		return fcusl;
	}
	public void setFcusl(double fcusl) {
		this.fcusl = fcusl;
	}
	public double getFcurt() {
		return fcurt;
	}
	public void setFcurt(double fcurt) {
		this.fcurt = fcurt;
	}
	public String getAirtype() {
		return airtype;
	}
	public void setAirtype(String airtype) {
		this.airtype = airtype;
	}
	public double getAirsl() {
		return airsl;
	}
	public void setAirsl(double airsl) {
		this.airsl = airsl;
	}
	public double getAirrt() {
		return airrt;
	}
	public void setAirrt(double airrt) {
		this.airrt = airrt;
	}
	public String getCentertype() {
		return centertype;
	}
	public void setCentertype(String centertype) {
		this.centertype = centertype;
	}
	public double getCentersl() {
		return centersl;
	}
	public void setCentersl(double centersl) {
		this.centersl = centersl;
	}
	public double getCenterrt() {
		return centerrt;
	}
	public void setCenterrt(double centerrt) {
		this.centerrt = centerrt;
	}
	public String getSupplywh() {
		return supplywh;
	}
	public void setSupplywh(String supplywh) {
		this.supplywh = supplywh;
	}
	public String getReturnwh() {
		return returnwh;
	}
	public void setReturnwh(String returnwh) {
		this.returnwh = returnwh;
	}
	public String getKitflg() {
		return kitflg;
	}
	public void setKitflg(String kitflg) {
		this.kitflg = kitflg;
	}
	public String getKitwh() {
		return kitwh;
	}
	public void setKitwh(String kitwh) {
		this.kitwh = kitwh;
	}
	public String getKitmemo() {
		return kitmemo;
	}
	public void setKitmemo(String kitmemo) {
		this.kitmemo = kitmemo;
	}
	public double getFiresl1() {
		return firesl1;
	}
	public void setFiresl1(double firesl1) {
		this.firesl1 = firesl1;
	}
	public double getFiresl2() {
		return firesl2;
	}
	public void setFiresl2(double firesl2) {
		this.firesl2 = firesl2;
	}
	public double getFiresl3() {
		return firesl3;
	}
	public void setFiresl3(double firesl3) {
		this.firesl3 = firesl3;
	}
	public double getSmokesl() {
		return smokesl;
	}
	public void setSmokesl(double smokesl) {
		this.smokesl = smokesl;
	}
	public String getTrapflg() {
		return trapflg;
	}
	public void setTrapflg(String trapflg) {
		this.trapflg = trapflg;
	}
	public double getLinesl1() {
		return linesl1;
	}
	public void setLinesl1(double linesl1) {
		this.linesl1 = linesl1;
	}
	public double getLinesl2() {
		return linesl2;
	}
	public void setLinesl2(double linesl2) {
		this.linesl2 = linesl2;
	}
	public double getPossl() {
		return possl;
	}
	public void setPossl(double possl) {
		this.possl = possl;
	}
	public String getIs_xssy() {
		return is_xssy;
	}
	public void setIs_xssy(String is_xssy) {
		this.is_xssy = is_xssy;
	}
	public String getHth() {
		return hth;
	}
	public void setHth(String hth) {
		this.hth = hth;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getOprid() {
		return oprid;
	}
	public void setOprid(String oprid) {
		this.oprid = oprid;
	}
	public String getAdtid() {
		return adtid;
	}
	public void setAdtid(String adtid) {
		this.adtid = adtid;
	}
	public String getPostid() {
		return postid;
	}
	public void setPostid(String postid) {
		this.postid = postid;
	}
	public String getSsld() {
		return ssld;
	}
	public void setSsld(String ssld) {
		this.ssld = ssld;
	}
	public String getLast_billid() {
		return last_billid;
	}
	public void setLast_billid(String last_billid) {
		this.last_billid = last_billid;
	}
	public String getLast_billno() {
		return last_billno;
	}
	public void setLast_billno(String last_billno) {
		this.last_billno = last_billno;
	}
	public String getLast_operid() {
		return last_operid;
	}
	public void setLast_operid(String last_operid) {
		this.last_operid = last_operid;
	}
	public Date getOprDate() {
		return oprDate;
	}
	public void setOprDate(Date oprDate) {
		this.oprDate = oprDate;
	}
	public Date getAdtDate() {
		return adtDate;
	}
	public void setAdtDate(Date adtDate) {
		this.adtDate = adtDate;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getIsmark() {
		return ismark;
	}
	public void setIsmark(String ismark) {
		this.ismark = ismark;
	}
	@Override
	public String toString() {
		return "BaShop [id=" + id + ", spjm=" + spjm + ", spname=" + spname
				+ ", spename=" + spename + ", status=" + status + ", isvalid="
				+ isvalid + ", str=" + str + ", floor=" + floor + ", regional="
				+ regional + ", location=" + location + ", shape=" + shape
				+ ", length=" + length + ", easy=" + easy + ", spxz=" + spxz
				+ ", zqjh=" + zqjh + ", hygh=" + hygh + ", ytgh=" + ytgh
				+ ", zlgh=" + zlgh + ", kind=" + kind + ", jzarea=" + jzarea
				+ ", syarea=" + syarea + ", zjarea=" + zjarea + ", arealx="
				+ arealx + ", rentdw=" + rentdw + ", rentts=" + rentts
				+ ", exprent=" + exprent + ", expsj=" + expsj + ", currencies="
				+ currencies + ", powerk=" + powerk + ", powersl=" + powersl
				+ ", cablessize1=" + cablessize1 + ", cablespcs1=" + cablespcs1
				+ ", cablessize2=" + cablessize2 + ", cablespcs2=" + cablespcs2
				+ ", cablessize3=" + cablessize3 + ", cablespcs3=" + cablespcs3
				+ ", waterflg=" + waterflg + ", watermemo=" + watermemo
				+ ", watersl=" + watersl + ", watersize=" + watersize
				+ ", fcutype=" + fcutype + ", fcusl=" + fcusl + ", fcurt="
				+ fcurt + ", airtype=" + airtype + ", airsl=" + airsl
				+ ", airrt=" + airrt + ", centertype=" + centertype
				+ ", centersl=" + centersl + ", centerrt=" + centerrt
				+ ", supplywh=" + supplywh + ", returnwh=" + returnwh
				+ ", kitflg=" + kitflg + ", kitwh=" + kitwh + ", kitmemo="
				+ kitmemo + ", firesl1=" + firesl1 + ", firesl2=" + firesl2
				+ ", firesl3=" + firesl3 + ", smokesl=" + smokesl
				+ ", trapflg=" + trapflg + ", linesl1=" + linesl1
				+ ", linesl2=" + linesl2 + ", possl=" + possl + ", is_xssy="
				+ is_xssy + ", hth=" + hth + ", memo=" + memo + ", oprid="
				+ oprid + ", adtid=" + adtid + ", postid=" + postid
				+ ", last_modified=" + last_modified + ", ssld=" + ssld
				+ ", last_billid=" + last_billid + ", last_billno="
				+ last_billno + ", last_operid=" + last_operid + ", oprDate="
				+ oprDate + ", adtDate=" + adtDate + ", source=" + source
				+ ", ismark=" + ismark + "]";
	}
	
	

}
