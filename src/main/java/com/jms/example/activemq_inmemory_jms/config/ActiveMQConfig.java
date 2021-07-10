package com.jms.example.activemq_inmemory_jms.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

import javax.jms.Queue;

/**
 * @author : Vishal Srivastava
 * @Date : 11-07-2021
 **/

@EnableJms
@Configuration
public class ActiveMQConfig {


    @Bean
    public Queue queue() {
        return new ActiveMQQueue("inMemory.queue");
    }

    // Here we are not configuring connection factory because this is in memory example
    // and spring boot automatically provide default connection factory


    // also we did not need to configure JmsTemplate as spring boot provide default auto connection factory to jmsTemplate

}
