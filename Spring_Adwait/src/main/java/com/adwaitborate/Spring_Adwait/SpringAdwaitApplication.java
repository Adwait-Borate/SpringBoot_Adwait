package com.adwaitborate.Spring_Adwait;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAdwaitApplication implements CommandLineRunner {

    private final PaymentInterface pi;

    // constructor injection
    public SpringAdwaitApplication(PaymentInterface pi) {
        this.pi = pi;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringAdwaitApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String payhere = pi.pay();
        System.out.println("Main function: " + payhere);
    }
}
