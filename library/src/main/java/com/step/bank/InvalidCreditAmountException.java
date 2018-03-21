package com.step.bank;

public class InvalidCreditAmountException extends Throwable {
    InvalidCreditAmountException() {
        super("Invalid Amount to credit");
    }
}
