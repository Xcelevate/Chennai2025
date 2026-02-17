package com.Day3Task.Mockito;

public class CheckoutService {
    private final PaymentGateway gateway;

    CheckoutService(PaymentGateway g) {
        this.gateway = g;
    }
    public String checkout(String id, double amount) {
        return gateway.charge(id, amount);
    }

}

