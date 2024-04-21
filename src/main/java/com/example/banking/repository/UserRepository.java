package com.example.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.banking.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	Boolean existsByEmail(String email);
	
}
