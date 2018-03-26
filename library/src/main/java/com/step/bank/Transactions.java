package com.step.bank;

import java.util.ArrayList;

public class Transactions {
    private final ArrayList<Transaction> list;

    public Transactions() {
        list = new ArrayList<>();
    }

    public void credit(String person, double balance) {
        list.add(new CreditTransaction(person,balance));
    }

    public ArrayList<Transaction> getList() {
        return list;
    }

    public void debit(String person, double balance) {
        list.add(new DebitTransaction(person,balance));
    }
}
