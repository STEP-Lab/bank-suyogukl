package com.step.bank;

public class InsuffficientBalanceException extends Throwable {
    InsuffficientBalanceException() {
        super("Insufficient Account Balance");
    }
}
