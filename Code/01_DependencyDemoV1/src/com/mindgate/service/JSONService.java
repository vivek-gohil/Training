package com.mindgate.service;

public class JSONService implements NotificationService {

	@Override
	public void sendMessage(String message, String receiver) {
		System.out.println("JSON " + message + " is sent to " + receiver);
	}

}
