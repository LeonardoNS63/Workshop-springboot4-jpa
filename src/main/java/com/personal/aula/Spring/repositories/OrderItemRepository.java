package com.personal.aula.Spring.repositories;

import com.personal.aula.Spring.entities.OrderItem;

import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
