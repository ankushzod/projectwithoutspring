package com.withoutspring.service;

import com.withoutspring.model.TextMessage;

public class MessageServiceImpl implements MeassageService {

	@Override
	public void processMessage(TextMessage t) {

		System.out.println("To:" + t.getTo());
		System.out.println("From:" + t.getFrom());
		System.out.println("Text:" + t.getText());
		
	}

}
