package org.example.oop.practice;

public class ReversiblePayment implements PaymentIntf {

    private PaymentIntf payment;

    public ReversiblePayment(PaymentIntf payment) {
        this.payment = payment;
    }

    @Override
    public void execute() {
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

    public void reverse(){
        setValue(-getValue());
        execute();
    }
}
