
package cn.ebatech.imixpark.user.webService_fj;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="storeid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agentid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rtn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="errormsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lasttoken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "userid",
    "password",
    "storeid",
    "agentid",
    "rtn",
    "errormsg",
    "lastdate",
    "lasttoken"
})
@XmlRootElement(name = "checkagent")
public class Checkagent {

    protected String userid;
    protected String password;
    protected String storeid;
    protected String agentid;
    protected short rtn;
    protected String errormsg;
    protected String lastdate;
    protected String lasttoken;

    /**
     * Gets the value of the userid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserid() {
        return userid;
    }

    /**
     * Sets the value of the userid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserid(String value) {
        this.userid = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the storeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreid() {
        return storeid;
    }

    /**
     * Sets the value of the storeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreid(String value) {
        this.storeid = value;
    }

    /**
     * Gets the value of the agentid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentid() {
        return agentid;
    }

    /**
     * Sets the value of the agentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentid(String value) {
        this.agentid = value;
    }

    /**
     * Gets the value of the rtn property.
     * 
     */
    public short getRtn() {
        return rtn;
    }

    /**
     * Sets the value of the rtn property.
     * 
     */
    public void setRtn(short value) {
        this.rtn = value;
    }

    /**
     * Gets the value of the errormsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrormsg() {
        return errormsg;
    }

    /**
     * Sets the value of the errormsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrormsg(String value) {
        this.errormsg = value;
    }

    /**
     * Gets the value of the lastdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastdate() {
        return lastdate;
    }

    /**
     * Sets the value of the lastdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastdate(String value) {
        this.lastdate = value;
    }

    /**
     * Gets the value of the lasttoken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLasttoken() {
        return lasttoken;
    }

    /**
     * Sets the value of the lasttoken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLasttoken(String value) {
        this.lasttoken = value;
    }

}
