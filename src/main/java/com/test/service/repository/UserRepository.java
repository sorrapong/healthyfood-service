package com.test.service.repository;

import org.springframework.stereotype.Repository;

import com.test.service.entities.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{	
	List<User> findByUsernameAndPassword(String username, String password);
	List<User> findByUsername(String username);
}
