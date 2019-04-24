package com.project.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.Item;
import com.project.service.ItemService;

@RestController
public class ItemController {
	
	@Autowired
	private ItemService itemService;

	@RequestMapping(value = "/add_item", method = RequestMethod.GET)
	public ModelAndView createItem(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("add_item");
		mav.addObject("item", new Item());
		return mav;
	}

	@RequestMapping(value = "/postingProcess", method = RequestMethod.POST)
	public ModelAndView createItem(HttpServletRequest request, HttpServletResponse response, 
			@ModelAttribute("item") Item item) {
		ModelAndView mav = null;
		itemService.create(item);
		mav = new ModelAndView("admin_welcome");
		mav.addObject("message2", "Item has been created");
		return mav;
	}

}
