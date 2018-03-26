package com.step.bank;

import java.util.Date;
import java.util.Objects;

public class Transaction {
    private final Date date;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return Double.compare(that.balance, balance) == 0 &&
                Objects.equals(date, that.date) &&
                Objects.equals(person, that.person);
    }

    @Override
    public int hashCode() {

        return Objects.hash(date, person, balance);
    }

    private final String person;
    private final double balance;

    public Transaction(Date date, String person, double balance) {
        this.date = date;
        this.person = person;
        this.balance = balance;
    }

    public Date getDate() {
        return date;
    }
}
