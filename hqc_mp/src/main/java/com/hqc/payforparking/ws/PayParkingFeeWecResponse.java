
package com.hqc.payforparking.ws;

import javax.xml.bind.annotation.*;


/**
 * <p>anonymous complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PayParkingFee_WecResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "payParkingFeeWecResult"
})
@XmlRootElement(name = "PayParkingFee_WecResponse")
public class PayParkingFeeWecResponse {

    @XmlElement(name = "PayParkingFee_WecResult")
    protected String payParkingFeeWecResult;

    /**
     * 获取payParkingFeeWecResult属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getPayParkingFeeWecResult() {
        return payParkingFeeWecResult;
    }

    /**
     * 设置payParkingFeeWecResult属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPayParkingFeeWecResult(String value) {
        this.payParkingFeeWecResult = value;
    }

}
