package com.adwaitborate.Spring_Adwait;

import org.springframework.stereotype.Component;

@Component
public class Razorpay implements PaymentInterface {
    @Override
    public String pay() {
        String payMethod = "RazorPay";
        System.out.println("Payment Method used here is: " + payMethod);
        return payMethod;
    }
}
