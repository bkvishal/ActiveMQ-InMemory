package com.jms.example.activemq_inmemory_jms.Controller;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author : Vishal Srivastava
 * @Date : 11-07-2021
 **/

@Component
public class Subscriber2 {


    @JmsListener(destination = "inMemory.queue")
    public void subs2(String msg) {
        System.out.println("Subscriber 2 read the message -- " + msg);
    }
}
