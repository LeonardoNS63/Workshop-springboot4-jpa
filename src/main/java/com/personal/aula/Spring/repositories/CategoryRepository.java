package com.personal.aula.Spring.repositories;

import com.personal.aula.Spring.entities.Category;

import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Long> {

}
