package com.example.kafkaexample.entity;

public class Message {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Message [message=" + message + "]";
	}

	public Message(String message) {
		super();
		this.message = message;
	}

	public Message() {
		super();
	}
	
	
}
