package com.devsuperior.bds11.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.bds11.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);
}
