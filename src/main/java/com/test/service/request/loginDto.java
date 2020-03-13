package com.test.service.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class loginDto {
	
	@JsonProperty("username")
    String username;
    @JsonProperty("password")
    String password;
    
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
   
}
