package org.example.oop.practice;

public class HighValuePayment implements PaymentIntf {
    private PaymentIntf payment;

    public HighValuePayment(PaymentIntf payment) {
        this.payment = payment;
    }

    @Override
    public void execute() {
        // verify this payment (high value payment'ın kattığı ek özellik)
        payment.execute();

    }

    @Override
    public int getValue() {
        return payment.getValue();
    }

    @Override
    public void setValue(int value) {
        payment.setValue(value);
    }
}
