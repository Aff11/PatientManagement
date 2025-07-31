package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.User;

public interface Userrepository extends JpaRepository<User,Long>{

	User findbyusername(String username);
}
