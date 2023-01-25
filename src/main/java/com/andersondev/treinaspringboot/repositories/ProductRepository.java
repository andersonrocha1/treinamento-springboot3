package com.andersondev.treinaspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andersondev.treinaspringboot.entities.Product;



public interface ProductRepository extends JpaRepository<Product, Long> {
	
	

}
