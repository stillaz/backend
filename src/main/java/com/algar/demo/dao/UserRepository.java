package com.algar.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algar.demo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
