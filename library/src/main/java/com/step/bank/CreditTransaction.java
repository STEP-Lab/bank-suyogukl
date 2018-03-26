package com.step.bank;

import java.util.Date;

public class CreditTransaction extends Transaction {
    public CreditTransaction(String person,double balance) {
        super(new Date(),person ,balance);
    }

}
