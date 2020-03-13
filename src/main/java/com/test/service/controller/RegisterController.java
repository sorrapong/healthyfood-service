package com.test.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.service.entities.User;
import com.test.service.request.loginDto;
import com.test.service.request.registerDto;
import com.test.service.response.Response;
import com.test.service.service.UserService;

public class RegisterController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/register", method=RequestMethod.POST)
	public Response<User> getAll(@RequestBody registerDto data) {
		User user =  userService.checkUser(data.getUsername());
		Response<User> response = null;
		
		try {
			
			if("".equals(data.getUsername()) || "".equals(data.getPassword()) || "".equals(data.getEmail()) || "".equals(data.getName())) {
				response = Response.error("Missing Params", null);
				
				return response;
			}
			
			if(user != null) {
				user = new User();
				
				user.setEmail(data.getEmail());
				user.setName(data.getName());
				user.setPassword(data.getPassword());
				user.setUsername(data.getUsername());
				
				userService.save(user);
				
				response = Response.success("Register Sucess", null);
			} else {
				response = Response.error("Duplicate Username", null); 
			}
		} catch (Exception e) {
			response = Response.error("Login Fail", null);
		}		
		
		return response;
	}
	
}
