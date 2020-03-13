package com.test.service.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class registerDto {
	@JsonProperty("username")
    String username;
    @JsonProperty("password")
    String password;
    @JsonProperty("name")
    String name;
    @JsonProperty("email")
    String email;
    
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
    
    
}
