package com.andersondev.treinaspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andersondev.treinaspringboot.entities.Order;



public interface OrderRepository extends JpaRepository<Order, Long> {
	
	

}
