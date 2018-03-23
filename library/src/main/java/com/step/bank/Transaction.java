package com.step.bank;

import java.util.Date;

public class Transaction {
    private final Date date;
    private final String person;
    private final double balance;

    public Transaction(Date date, String person, double balance) {
        this.date = date;
        this.person = person;
        this.balance = balance;
    }

    public Date getDate() {
        return date;
    }
}
