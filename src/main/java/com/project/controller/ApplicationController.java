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

}
