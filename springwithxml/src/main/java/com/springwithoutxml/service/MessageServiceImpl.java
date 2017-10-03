package com.springwithoutxml.service;

import com.springwithoutxml.model.TextMessage;

public class MessageServiceImpl implements MeassageService {

	private TextMessage textMessage = null;

	public void setTextMessage(TextMessage textMessage) {
		this.textMessage = textMessage;
	}

	public void processMessage(TextMessage t) {
		
		t = this.textMessage;
		System.out.println("To:" + t.getTo());
		System.out.println("From:" + t.getFrom());
		System.out.println("Text:" + t.getText());

	}

}
