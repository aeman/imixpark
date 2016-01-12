package cn.ebatech.imixpark.common.model.user;

import javax.xml.ws.Holder;

public class Message {
	private Holder<String> outputpara;
	private Holder<Integer> rtn;
	private Holder<String> errormsg;
	public Message(Holder<String> outputpara2, Holder<Integer> rtn2,
			Holder<String> errormsg2, Holder<Short> result2) {
		this.errormsg=errormsg2;
		this.outputpara=outputpara2;
		this.result=result2;
		this.rtn=rtn2;
	}
	public Holder<String> getOutputpara() {
		return outputpara;
	}
	public void setOutputpara(Holder<String> outputpara) {
		this.outputpara = outputpara;
	}
	public Holder<Integer> getRtn() {
		return rtn;
	}
	public void setRtn(Holder<Integer> rtn) {
		this.rtn = rtn;
	}
	public Holder<String> getErrormsg() {
		return errormsg;
	}
	public void setErrormsg(Holder<String> errormsg) {
		this.errormsg = errormsg;
	}
	public Holder<Short> getResult() {
		return result;
	}
	public void setResult(Holder<Short> result) {
		this.result = result;
	}
	private Holder<Short> result;
	@Override
	public String toString() {
		return "Message [outputpara=" + outputpara.value + ", rtn=" + rtn.value
				+ ", errormsg=" + errormsg.value + ", result=" + result.value + "]";
	}
	public String[] outputpara2Array() {
		// TODO Auto-generated method stub
		if(this.outputpara!=null&&this.outputpara.value!=null){
			return this.outputpara.value.split("\t");
		}else{
			return null;
		}
	}
	public String[] outputpara2List() {
		// TODO Auto-generated method stub
		if(this.outputpara!=null&&this.outputpara.value!=null){
			return this.outputpara.value.split("\n");
		}else{
			return null;
		}
	}
	
}
