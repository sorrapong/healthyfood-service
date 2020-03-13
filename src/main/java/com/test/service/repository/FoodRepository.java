package com.test.service.repository;

import org.springframework.stereotype.Repository;

import com.test.service.entities.Food;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface FoodRepository extends JpaRepository<Food,Long>{	
	
}
