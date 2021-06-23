package com.example.demo.controller;

import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.StudentRepository;
import com.example.demo.configuration.MessagingConfig;
import com.example.demo.model.Address;
import com.example.demo.model.Student;
import com.example.demo.service.IntegrationGateway;

@RestController
@RequestMapping("/integrate")
public class IntegrationController {
     @Autowired
	private IntegrationGateway integrationGateway;
     @Autowired
     private StudentRepository studentRepository;
     @Autowired
     private RabbitTemplate template;
     
     
     @PostMapping("/student")
 	public void processStudentDetails(@RequestBody Student student) {
 		integrationGateway.process(student);
 		studentRepository.save(student);
 		
 	}

     
     @PostMapping("/{details}")
        public String savedetails(@RequestBody Address address,@PathVariable String details) {
         address.setAddressid(UUID.randomUUID().toString());
         integrationGateway.process(address);
         template.convertAndSend(MessagingConfig.EXCHANGE, MessagingConfig.ROUTING_KEY, address);
            return "Success !!";
        }

 

}
 



 	 
 	 
 	 
 	 
 	 

