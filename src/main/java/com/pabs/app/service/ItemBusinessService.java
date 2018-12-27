package com.pabs.app.service;

import org.springframework.stereotype.Component;

import com.pabs.app.beans.Item;

@Component
public class ItemBusinessService {
	
	public Item retriveHardCodedItem() {
		return new Item(1,"FootBall",10,10);
	}

}
