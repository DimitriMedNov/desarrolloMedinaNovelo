package com.mayab.desarrollo.comportamiento.strategy;

import java.util.Date;

public class Transaction {
    private Date date;
    private String commerce;
    private double amount;
    private String category;

    public Transaction(Date date, String commerce, double amount, String category) {
        this.date = date;
        this.commerce = commerce;
        this.amount = amount;
        this.category = category;
    }

    public Date getDate() {
        return date;
    }

    public String getCommerce() {
        return commerce;
    }

    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "date=" + date +
                ", commerce='" + commerce + '\'' +
                ", amount=" + amount +
                ", category='" + category + '\'' +
                '}';
    }
}