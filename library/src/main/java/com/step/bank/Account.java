package com.step.bank;

import java.util.Objects;

public class Account {
    private static final double MinimumBalance = 1000;
    private final AccountNumber accountNumber;
    private double accountBalance;
    private final String name;

    public Account(String name, AccountNumber accountNumber, int accountBalance) throws MinimumBalanceException {
        this.name = name;
        validateAccount(accountBalance);
        this.accountNumber = accountNumber;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Double.compare(account.accountBalance, accountBalance) == 0 &&
                Objects.equals(accountNumber, account.accountNumber) &&
                Objects.equals(name, account.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(accountNumber, accountBalance, name);
    }

    public Summary getSummary() {
        return new Summary(name,accountNumber,accountBalance);
    }
}
