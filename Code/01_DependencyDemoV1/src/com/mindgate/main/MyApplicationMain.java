package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.application.MyApplication;
import com.mindgate.service.EmailService;
import com.mindgate.service.JSONService;
import com.mindgate.service.SMSService;

public class MyApplicationMain {

	public static void main(String[] args) {
		int choice;
		Scanner scanner = new Scanner(System.in);

		EmailService emailService = new EmailService();
		SMSService smsService = new SMSService();
		JSONService jsonService = new JSONService();

		MyApplication application;

		System.out.println("Menu");
		System.out.println("1..SMS Notification");
		System.out.println("2..Email Notification");
		System.out.println("3..JSON Notification");

		choice = scanner.nextInt();
		switch (choice) {
		case 1:
			application = new MyApplication(smsService);
			application.sendNotification("Hi", "123456789");
			break;
		case 2:
			application = new MyApplication(emailService);
			application.sendNotification("Hello", "ghl_vivek@hotmail.com");
			break;
		case 3:
			application = new MyApplication(jsonService);
			application.sendNotification("key : Value", "121.123.5.122");
			break;
		default:
			break;
		}
	}

}
