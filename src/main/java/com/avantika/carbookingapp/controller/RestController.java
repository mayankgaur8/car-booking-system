package com.avantika.carbookingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.avantika.carbookingapp.model.User;
import com.avantika.carbookingapp.service.UserService;


@Controller
public class RestController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String home()
	{
		return "home";
	}
	
	
	
}
