package com.project.v1.realestatesystem.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Payments {
    @Id
    private String ID;
    private String amount;
    private String paymentType;
    private String payTime;

    public Payments() {
    }

    public Payments(String ID, String amount, String paymentType, String payTime) {
        this.ID = ID;
        this.amount = amount;
        this.paymentType = paymentType;
        this.payTime = payTime;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }
}
