package com.project.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApplicationController {
	
	@RequestMapping("/")
	public String welcome(HttpServletRequest request) {
		// request.setAttribute("mode", "MODE_REGISTER");
		return "index";
	}
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request) {
	    request.setAttribute("mode", "MODE_LOGIN");
		return "login";
	}
	
	@RequestMapping("/welcome")
	public String welcome1(HttpServletRequest request) {
	    request.setAttribute("mode", "MODE_WELCOME");
		return "welcome";
	}
	
	@RequestMapping("/admin_welcome")
	public String admin_welcome(HttpServletRequest request) {
	    request.setAttribute("mode", "MODE_AWELCOME");
		return "admin_welcome";
	}
	
	@RequestMapping("/register")
	public String register(HttpServletRequest request) {
	    request.setAttribute("mode", "MODE_REGISTER");
		return "register";
	}
	
	@RequestMapping("/add_item")
	public String add_item(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_ITEM");
		return "add_item";
	}
	
	@RequestMapping("/view_items")
	public String view_item(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_VIEW_ITEM");
		return "view_items";
	}
	
	@RequestMapping("/view_items_cust")
	public String view_items_cust(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_VIEW_ITEMC");
		return "view_items_cust";
	}
	
	@RequestMapping("/review")
	public String review(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_REVIEW");
		return "review";
	}

}
