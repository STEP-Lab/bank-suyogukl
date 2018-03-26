package com.step.bank;

import java.util.Date;

public class DebitTransaction extends Transaction {
    public DebitTransaction(String person, double balance) {
        super(new Date(),person,balance);
    }
}
