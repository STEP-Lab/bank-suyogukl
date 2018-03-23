package com.step.bank;

import java.util.Objects;

public class Summary {
    private final String name;
    private final AccountNumber accountNumber;
    private final double accountBalance;

    public Summary(String name, AccountNumber accountNumber, double accountBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Summary summery = (Summary) o;
        return Double.compare(summery.accountBalance, accountBalance) == 0 &&
                Objects.equals(name, summery.name) &&
                Objects.equals(accountNumber, summery.accountNumber);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, accountNumber, accountBalance);
    }
}
