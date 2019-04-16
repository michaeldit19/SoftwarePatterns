package com.project.controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.Customers;
import com.project.model.Login;
import com.project.service.CustomerService;




@WebServlet("/loginProcess")
@RestController
public class LoginController extends HttpServlet {
	
	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("login");
		mav.addObject("login", new Login());
        return mav;
	}

	
	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("login") Login login, BindingResult result) {
		
		
		ModelAndView mav = null;

		Customers customers = customerService.validateCustomer(login);

		if (null != customers) {
			mav = new ModelAndView("welcome");
			
		} else if (login.getUsername().equals("admin")&&login.getPassword().equals("root")) {
			mav = new ModelAndView("admin_welcome");
		}
		
		else {
			mav = new ModelAndView("login");
			mav.addObject("message", "Username or Password is invalid....");
		}
		return mav;
	}
		
	}
	
	

