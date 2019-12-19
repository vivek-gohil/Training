package com.mindgate.service;

public class SMSService implements NotificationService {

	@Override
	public void sendMessage(String message, String receiver) {
		System.out.println("SMS :: " + message + " is sent to " + receiver);
	}

}
