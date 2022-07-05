package com.example.kafkaexample.controller;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.kafkaexample.entity.Message;

@RestController
@RequestMapping("/message")
public class MessageController {

	@Autowired
	KafkaTemplate<String, Message> kafkaTemplate;
	
	@PostMapping(value="/send", consumes = "application/json", produces = "application/json")
	public void sendMessage(@RequestBody Message message) {
				kafkaTemplate.send("intro", message);
	}
	
	
}
