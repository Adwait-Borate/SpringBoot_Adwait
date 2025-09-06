package com.adwaitborate.Spring_Adwait;


import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class Razorpay implements PaymentInterface{


    @Override
    public String pay() {
        String payMethod="Stripe";
        System.out.println("Payment Method used here is: "+payMethod);
        return payMethod;
    }
}
