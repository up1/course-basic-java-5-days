package com.example.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.security.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}
