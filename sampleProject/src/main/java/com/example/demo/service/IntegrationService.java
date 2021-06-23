package com.example.demo.service;

import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessagingException;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
public class IntegrationService {
	public void anotherMessage(Message<String> message) throws MessagingException {
		 MessageChannel replayChannel=(MessageChannel) message.getHeaders().getReplyChannel();
		 MessageBuilder.fromMessage(message);
		 Message<String> newMessage= MessageBuilder
				 .withPayload("welcm,"+message.getPayload() +"to SI for the frst time").build();
				 replayChannel.send(newMessage);
				 
	}

}
