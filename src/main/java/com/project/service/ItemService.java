package com.project.service;

import com.project.model.Item;

public interface ItemService {
	
	void create(Item item);
	
	Iterable<Item> findAllItems();

}
