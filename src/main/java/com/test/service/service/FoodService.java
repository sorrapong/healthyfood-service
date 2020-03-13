package com.test.service.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.service.entities.Food;
import com.test.service.repository.FoodRepository;

@Service
public class FoodService {

	@Autowired
	private FoodRepository foodRepository;
	
	public List<Food> getAll(){
		return foodRepository.findAll();		
	}
	
	public Optional<Food> getById(Long id) {
		return foodRepository.findById(id);
	}
	
	public void addCity(Food food) {
		foodRepository.save(food);
	}
	
}
