
package com.htc.test.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for makePayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="makePayment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bankAccount" type="{http://ws.test.htc.com/}bankAccount" minOccurs="0"/&gt;
 *         &lt;element name="payMoney" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="companyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "makePayment", propOrder = {
    "bankAccount",
    "payMoney",
    "companyId"
})
public class MakePayment {

    protected BankAccount bankAccount;
    protected double payMoney;
    protected String companyId;

    /**
     * Gets the value of the bankAccount property.
     * 
     * @return
     *     possible object is
     *     {@link BankAccount }
     *     
     */
    public BankAccount getBankAccount() {
        return bankAccount;
    }

    /**
     * Sets the value of the bankAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAccount }
     *     
     */
    public void setBankAccount(BankAccount value) {
        this.bankAccount = value;
    }

    /**
     * Gets the value of the payMoney property.
     * 
     */
    public double getPayMoney() {
        return payMoney;
    }

    /**
     * Sets the value of the payMoney property.
     * 
     */
    public void setPayMoney(double value) {
        this.payMoney = value;
    }

    /**
     * Gets the value of the companyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * Sets the value of the companyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyId(String value) {
        this.companyId = value;
    }

}
