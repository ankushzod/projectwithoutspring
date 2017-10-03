package com.withoutspring.main;

import com.withoutspring.model.TextMessage;
import com.withoutspring.service.MeassageService;
import com.withoutspring.service.MessageServiceImpl;

public class App {
	
	public static void main(String[] args) {
		TextMessage textMessage = new TextMessage();
		
		textMessage.setTo("Vijay");
		textMessage.setFrom("Ankush");
		textMessage.setText("Hi how are you?");
		
		MeassageService messageService = new MessageServiceImpl();
		
		messageService.processMessage(textMessage);
		
	}
	

}
