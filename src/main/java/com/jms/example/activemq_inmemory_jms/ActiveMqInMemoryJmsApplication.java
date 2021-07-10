package com.jms.example.activemq_inmemory_jms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;


@SpringBootApplication
public class ActiveMqInMemoryJmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActiveMqInMemoryJmsApplication.class, args);
    }

}
