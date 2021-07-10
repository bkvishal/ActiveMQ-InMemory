package com.jms.example.activemq_inmemory_jms.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Queue;

/**
 * @author : Vishal Srivastava
 * @Date : 11-07-2021
 **/

@RestController
@RequestMapping(value = "/rest")
public class ProducerController {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Autowired
    private Queue queue;

    @GetMapping(value = "/msg/{message}")
    public String produce(@PathVariable("message") String message) {

        // spring boot automatically create factories and auto inject it into the application
        // because this in memory activeMQ.

        jmsTemplate.convertAndSend(queue, message);
        return "Producer produce successfully";

    }
}
