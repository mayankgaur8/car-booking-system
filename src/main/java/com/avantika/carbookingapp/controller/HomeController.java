package com.avantika.carbookingapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.avantika.carbookingapp.model.User;
import com.avantika.carbookingapp.service.UserService;

@Controller
@RestController
@RequestMapping("/user")
@CrossOrigin(origins="http://localhost:3001/")
public class HomeController {

	@Autowired
	private UserService userService;
   
	@RequestMapping("/welcome")
	public String welcome(HttpServletRequest request)
	{
		request.setAttribute("mode","MODE_HOME");
		return "welcome";
	}
	
	@RequestMapping("/cabregister")
	public String cabRegistration(HttpServletRequest request)
	{
		request.setAttribute("mode","MODE_REGISTER");
		return "welcome";
	}
	
	@PostMapping("/save-user")
	public String registerCabUser(@ModelAttribute User user,BindingResult bindingResult,HttpServletRequest request)
	{
		userService.saveCabUserDeatils(user);
		request.setAttribute("mode","MODE_HOME");
		return "welcome";
	}
	
	@GetMapping("/show-cab-users")
	public String showAllUsers(HttpServletRequest request) {
		request.setAttribute("users", userService.showAllAvailableCabs());
		request.setAttribute("mode", "ALL_USERS");
		return "welcome";
	}
	@RequestMapping("/delete-cab-user")
	public String deleteUser(@RequestParam int id, HttpServletRequest request) {
		userService.deleteCabBooked(id);
		request.setAttribute("users", userService.showAllAvailableCabs());
		request.setAttribute("mode", "ALL_USERS");
		return "welcome";
	}
	
	@GetMapping("saveuser")
	public String saveCabUser(@RequestParam Integer id,@RequestParam String name,@RequestParam String email,@RequestParam String phone,@RequestParam String pickupLocation,@RequestParam String destination,@RequestParam String pickupDate,@RequestParam String hour,@RequestParam String min,@RequestParam String ampm)
	{
		User user=new User(id, name, email, phone, pickupLocation, destination, pickupDate, hour, min, ampm);
		userService.saveCabUserDeatils(user);
		return "cab user saved!";
	}
	
}
