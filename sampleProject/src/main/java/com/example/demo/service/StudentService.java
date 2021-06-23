package com.example.demo.service;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessagingException;
import org.springframework.stereotype.Component;

@Component
public class StudentService {
	

		@ServiceActivator(inputChannel = "student.channel")
		public void recieveMessage(Message<?> message) throws MessagingException {
			System.out.println("###student.channel###");
			System.out.println(message);
			System.out.println(message.getPayload());
		}
}
