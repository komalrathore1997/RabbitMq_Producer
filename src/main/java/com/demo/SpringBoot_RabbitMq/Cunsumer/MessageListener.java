package com.demo.SpringBoot_RabbitMq.Cunsumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.demo.SpringBoot_RabbitMQ.config.CustomMessage;
import com.demo.SpringBoot_RabbitMQ.config.MQConfig;

@Component
public class MessageListener {

    @RabbitListener(queues = MQConfig.QUEUE)
    public void listener(CustomMessage message) {
        System.out.println(message);
    }

}