
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
 *         &lt;element name="testconnectuserResult" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="rtn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="errormsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "testconnectuserResult",
    "rtn",
    "errormsg"
})
@XmlRootElement(name = "testconnectuserResponse")
public class TestconnectuserResponse {

    protected short testconnectuserResult;
    protected int rtn;
    protected String errormsg;

    /**
     * Gets the value of the testconnectuserResult property.
     * 
     */
    public short getTestconnectuserResult() {
        return testconnectuserResult;
    }

    /**
     * Sets the value of the testconnectuserResult property.
     * 
     */
    public void setTestconnectuserResult(short value) {
        this.testconnectuserResult = value;
    }

    /**
     * Gets the value of the rtn property.
     * 
     */
    public int getRtn() {
        return rtn;
    }

    /**
     * Sets the value of the rtn property.
     * 
     */
    public void setRtn(int value) {
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

}
