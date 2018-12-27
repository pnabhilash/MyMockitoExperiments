package com.pabs.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.pabs.app.beans.Item;
import com.pabs.app.service.ItemBusinessService;

@RestController
public class ItemController {
	
	@Autowired
	private ItemBusinessService itemBusinessService;
	
	@GetMapping("/dummyitem")
	public Item getDummyItemList() {
		return new Item(1,"FootBall",10,100);
	}

	
	@GetMapping("/item-from-bis-service")
	public Item getDummyItemListFriomBusinessService() {
		return itemBusinessService.retriveHardCodedItem();
	}
	
}
