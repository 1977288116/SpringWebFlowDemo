package com.chenjl.domain;

import java.io.Serializable;

public class Payment implements Serializable{

    private static final long serialVersionUID = -8584674165340547951L;

    private float amount;

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
