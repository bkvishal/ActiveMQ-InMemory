package com.jms.example.activemq_inmemory_jms.Controller;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author : Vishal Srivastava
 * @Date : 11-07-2021
 **/

@Component
public class Subscriber {

    @JmsListener(destination = "inMemory.queue")
    public void subscriber(String message) {
        System.out.println("Subscriber 1 read the message -- " + message);
    }
}
