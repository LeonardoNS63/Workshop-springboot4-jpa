package com.personal.aula.Spring.repositories;

import com.personal.aula.Spring.entities.Product;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
