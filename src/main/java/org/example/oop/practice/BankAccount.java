package org.example.oop.practice;

import java.util.Optional;

public class BankAccount implements PaymentMethod{
    private String sortCode;
    private String accountNumber;

    public BankAccount(String sortCode, String accountNumber) {
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
    }

    @Override
    public Optional<Payment> makePayment(int value) {
        return Optional.empty();
    }
}
