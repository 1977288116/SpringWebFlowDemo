package com.chenjl.domain;

import java.io.Serializable;

public class PaymentDetails implements Serializable{

    private static final long serialVersionUID = -7129346494774688372L;

    private PaymentType paymentType;

    private String creditCardNumber;

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }
}
