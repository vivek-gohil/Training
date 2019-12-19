package com.mindgate.service;

public class EmailService implements NotificationService {
	public void sendMessage(String message, String receiver) {
		System.out.println("Message :: " + message + " is sent to :: " + receiver);
	}
}
