package com.step.bank;

public class Account {
    private static final double MinimumBalance = 1000;
    private String accountNumber;
    private double accountBalance;

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

    public double getAccountBalance(){
        return accountBalance;
    }

    public double withdraw(double amount) throws InsufficientBalanceException {
        if(amount > accountBalance - MinimumBalance) throw new InsufficientBalanceException();
        accountBalance -= amount;
        return accountBalance;
    }

    public double credit(double amount) throws InvalidCreditAmountException {
        int min=0;
        if (min > amount) {
            throw new InvalidCreditAmountException();
        }
        accountBalance += amount;
        return accountBalance;
    }
}
