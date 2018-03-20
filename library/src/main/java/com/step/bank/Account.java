package com.step.bank;

public class Account {
    private static final int MinimumBalance = 1000;
    private String accountNumber;
    private int accountBalance;

    public Account(String accountNumber, int accountBalance) throws MinimumBalanceException, InvalidAccountNumberException {
        validateAccount(accountNumber,accountBalance);
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }
    private void validateAccount(String accountNumber, int accountBalance) throws MinimumBalanceException, InvalidAccountNumberException {
        if (MinimumBalance > accountBalance){
            throw new MinimumBalanceException();
        }
        if(!accountNumber.matches("\\d{4}-\\d{4}")){
            throw new InvalidAccountNumberException();
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getAccountBalance(){
        return accountBalance;
    }
}
