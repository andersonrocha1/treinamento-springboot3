package com.andersondev.treinaspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andersondev.treinaspringboot.entities.OrderItem;



public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
	

}
