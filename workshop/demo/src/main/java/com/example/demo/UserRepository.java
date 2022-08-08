package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository
     extends JpaRepository<User, Integer> {

//    @Query("SELECT * FROM user where name = ?")
//    List<User> findAllByName(String name);

}
