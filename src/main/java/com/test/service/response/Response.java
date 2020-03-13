package com.test.service.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response<T> {
	
	@JsonProperty("STATUS")
	private String STATUS;
	@JsonProperty("MESSAGE")
	private String MESSAGE;
	@JsonProperty("DATA")
	private T data;
	
	public Response() {
		
	}

	public Response(String sTATUS, String mESSAGE, T data) {
		super();
		STATUS = sTATUS;
		MESSAGE = mESSAGE;
		this.data = data;
	}
	
	public static <T> Response<T> success(String message, T data) {
		return new Response<T>("success", message, data);
	}

	public static <T> Response<T> error(String message, T data) {
		return new Response<T>("error", message, data);
	}
	
}
