package com.tech.boot.mydemo.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tech.boot.mydemo.pojo.Item;

@RestController

public class ItemController {
	@RequestMapping(value="/itempapi",method=RequestMethod.GET)
	public String justSampleRequest() {
		return "All is well ...";
	}
	@RequestMapping(value="/allitems",method=RequestMethod.GET)
	public List<Item> fetchAllItems() {
		Item itm1=new Item(1,"food","good quality");
		Item itm2=new Item(2,"food","good quality");
		Item itm3=new Item(3,"food","good quality");
		Item itm4=new Item(4,"food","good quality");
		
		List<Item> itmlst=new ArrayList<>();
		itmlst.add(itm1);
		itmlst.add(itm2);
		itmlst.add(itm3);
		itmlst.add(itm4);
		return itmlst;
	}
}
