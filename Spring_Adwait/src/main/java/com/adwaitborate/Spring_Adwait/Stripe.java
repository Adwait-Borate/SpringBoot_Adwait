package com.adwaitborate.Spring_Adwait;

import org.springframework.stereotype.Component;

@Component
public class Stripe implements PaymentInterface {
    @Override
    public String pay() {
        String payMethod = "Stripe";
        System.out.println("Payment Method used here is: " + payMethod);
        return payMethod;
    }
}
