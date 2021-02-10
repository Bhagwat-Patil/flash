package com.cjc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String firstpage()
	{
		
		return "login";
	}
	
	@RequestMapping("/log")
	public String loginpage()
	{
		System.out.println("Hello");
		return "success";
	}
}
