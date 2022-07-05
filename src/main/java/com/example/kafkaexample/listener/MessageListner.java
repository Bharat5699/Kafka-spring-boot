package com.example.kafkaexample.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.kafkaexample.entity.Message;

@Service
public class MessageListner {

	
	@KafkaListener(topics = "intro", 
            groupId = "group-id")
    public void consume(Message message) 
    {
        System.out.println(String.format("Message recieved -> %s", message));
    }
}
