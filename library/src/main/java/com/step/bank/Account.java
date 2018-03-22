package com.step.bank;

public class Account {
    private static final double MinimumBalance = 1000;
    private AccountNumber accountNumber;
    private double accountBalance;

    public Account(String accountNumber, int accountBalance) throws MinimumBalanceException, InvalidAccountNumberException {
        validateAccount(accountBalance);
        this.accountNumber = new AccountNumber(accountNumber);
        this.accountBalance = accountBalance;
    }
    private void validateAccount(int accountBalance) throws MinimumBalanceException{
        if (MinimumBalance > accountBalance){
            throw new MinimumBalanceException();
        }
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
