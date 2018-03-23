package com.step.bank;

import java.util.Objects;

public class AccountNumber {

    private String accountNumber;

    public AccountNumber(String accountNumber) throws InvalidAccountNumberException {
        this.accountNumber = accountNumber;
        validateAccountNumber(accountNumber);
    }
    private void validateAccountNumber(String AccountNumberStr) throws InvalidAccountNumberException {
        if(!AccountNumberStr.matches("\\d{4}-\\d{4}")) {
            throw new InvalidAccountNumberException();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountNumber that = (AccountNumber) o;
        return Objects.equals(accountNumber, that.accountNumber);
    }

    @Override
    public int hashCode() {

        return Objects.hash(accountNumber);
    }
}
