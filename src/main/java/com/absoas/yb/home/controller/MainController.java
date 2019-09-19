package com.absoas.yb.home.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.absoas.yb.home.service.IUserService;

@Controller
public class MainController {
	
	@Autowired
	IUserService service;
	
	@RequestMapping("/")
	public String welcome() {
		System.out.println(service.selectUserList().getUser_id());
		
		return "welcome";
	}
	
}
