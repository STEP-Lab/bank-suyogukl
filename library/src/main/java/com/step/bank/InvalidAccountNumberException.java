package com.step.bank;

public class InvalidAccountNumberException extends Throwable {
    InvalidAccountNumberException() {
        super("Invalid account number");
    }
}
