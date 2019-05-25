package com.paf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paf.model.UserData;
import com.paf.service.UserService;



@RestController
@RequestMapping("/paff")

public class UserController {
	
@Autowired
	
	UserService userService;
	
	@PostMapping("/register")
	public String createNewUser(@RequestBody UserData userValues ) {
		String response ;
		response = userService.registerUser(userValues);
		return response;
	}
	
	@PostMapping("/login")
	public String validateUser(@RequestBody UserData userValues ) {
		String response ;
		response = userService.validateCredentials(userValues);
		return response;
	}
	
	@PostMapping("/reset")
	public String resetPassword(@RequestBody UserData userValues ) {
		String response ;
		response = userService.resetPassword(userValues);
		return response;
	}
	
	

}
