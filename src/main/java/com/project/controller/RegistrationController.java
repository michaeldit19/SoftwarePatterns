package com.project.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.Customers;
import com.project.service.CustomerService;



@RestController
public class RegistrationController {
	
	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("register");
		mav.addObject("customers", new Customers());
		return mav;
	}
	
	@PostMapping("/registerProcess")
	public ModelAndView addUser(HttpServletRequest request, @ModelAttribute("customer") Customers customers,
			HttpSession session) {
		ModelAndView mav = new ModelAndView("welcome");
		addCustomerToSession(customers, session);
		customerService.register(customers);
		return mav;
	}
	
	private void addCustomerToSession(Customers customers, HttpSession session) {
		session.setAttribute("customers", customers);
		session.setAttribute("id", customers.getId());
	}


}
