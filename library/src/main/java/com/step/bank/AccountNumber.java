package com.step.bank;

public class AccountNumber {
    private String accountNumber;

    public AccountNumber(String accountNumber) throws InvalidAccountNumberException {
        validateAccountNumber(accountNumber);
        this.accountNumber = accountNumber;
    }
    private void validateAccountNumber(String AccountNumberStr) throws InvalidAccountNumberException {
        if(!AccountNumberStr.matches("\\d{4}-\\d{4}")) {
            throw new InvalidAccountNumberException();
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

}
