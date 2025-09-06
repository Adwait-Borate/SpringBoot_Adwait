package com.adwaitborate.Spring_Adwait;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAdwaitApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringAdwaitApplication.class, args);
	}

   @Autowired
    private Razorpay razor;
    @Override
    public void run(String... args) throws Exception {
        String payhere= razor.payment();
        System.out.println("Main function: "+ payhere);
    }
}
