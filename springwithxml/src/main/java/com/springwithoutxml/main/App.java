package com.springwithoutxml.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springwithoutxml.model.TextMessage;
import com.springwithoutxml.service.MeassageService;

public class App {
	
	public static void main(String[] args) {
		TextMessage textMessage = new TextMessage();
		
		textMessage.setTo("Vijay");
		textMessage.setFrom("Ankush");
		textMessage.setText("Hi how are you?");
		
		  ApplicationContext context = new ClassPathXmlApplicationContext(
					"Spring-Module.xml");
		  
		  MeassageService messageService = (MeassageService) context.getBean("messageServiceImpl");
		messageService.processMessage(textMessage);
		
	}
	

}
