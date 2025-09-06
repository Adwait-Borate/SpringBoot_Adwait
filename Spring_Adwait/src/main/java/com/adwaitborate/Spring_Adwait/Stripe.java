package com.adwaitborate.Spring_Adwait;

public class Stripe implements PaymentInterface{
    @Override
    public String pay() {
        String payMethod="RazorPay";
        System.out.println("Payment Method used here is: "+payMethod);
        return payMethod;
    }
}
