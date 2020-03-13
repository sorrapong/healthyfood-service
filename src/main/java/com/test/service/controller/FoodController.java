package com.test.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.service.entities.Food;
import com.test.service.service.FoodService;

@RestController
public class FoodController {
	
	@Autowired
	private FoodService foodService; 
	
	@RequestMapping(value = "/foods", method=RequestMethod.GET)
	public List<Food> getAll() {
		return foodService.getAll();
	}
}
