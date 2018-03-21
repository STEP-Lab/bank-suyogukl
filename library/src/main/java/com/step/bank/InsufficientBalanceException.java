package com.step.bank;

public class InsufficientBalanceException extends Throwable {
    InsufficientBalanceException() {
        super("Insufficient Account Balance");
    }
}
