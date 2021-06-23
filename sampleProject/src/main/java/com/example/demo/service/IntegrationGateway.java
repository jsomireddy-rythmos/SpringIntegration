package com.example.demo.service;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

import com.example.demo.model.Student;

@MessagingGateway
public interface IntegrationGateway {



@Gateway(requestChannel = "router.channel")
public <T> void process(T object);
}