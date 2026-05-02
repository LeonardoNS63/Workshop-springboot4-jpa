package com.personal.aula.Spring.repositories;

import com.personal.aula.Spring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

}
