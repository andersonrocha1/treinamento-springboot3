package com.andersondev.treinaspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andersondev.treinaspringboot.entities.User;



public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
