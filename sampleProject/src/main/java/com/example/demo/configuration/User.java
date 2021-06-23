
package com.example.demo.configuration;
import com.example.demo.configuration.MessagingConfig;
import com.example.demo.model.Address;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class User {

    @RabbitListener(queues = MessagingConfig.QUEUE)
    public void consumeMessageFromQueue(Address address) {
        System.out.println("Message recieved from queue : " + address);
   }
}

