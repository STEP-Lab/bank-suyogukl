package com.step.bank;

public class Account {

    private String accountNumber;
    private int accountBalance;

    public Account(String accountNumber, int accountBalance){

        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getAccountBalance(){
        return accountBalance;
    }
}
