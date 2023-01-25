package com.andersondev.treinaspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andersondev.treinaspringboot.entities.Category;



public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	

}
