package com.Practice;

public class OrderService {

    private final PaymentService paymentService;

    OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public int placeOrder(int price1, int price2) {
        return paymentService.finalAmount(price1)
                + paymentService.finalAmount(price2);
    }
}
