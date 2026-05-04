package com.personal.aula.Spring.repositories;

import com.personal.aula.Spring.entities.Order;

import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
