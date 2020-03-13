package com.test.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.service.entities.Food;
import com.test.service.entities.User;
import com.test.service.request.loginDto;
import com.test.service.response.Response;
import com.test.service.service.UserService;

@RestController
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/login", method=RequestMethod.POST)
	public Response<User> getAll(@RequestBody loginDto data) {
		User user =  userService.checkUserPass(data.getUsername(), data.getPassword());
		Response<User> response = null;		
		
		try {
			if(user != null) {
				user.setPassword("");				
				response = Response.success("Login Sucess", user);
			} else {
				response = Response.error("Login Fail", null); 
			}
		} catch (Exception e) {
			response = Response.error("Login Fail", null);
		}		
		
		return response;
	}
}
