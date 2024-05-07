package com.example.contactmanager.SmartContactManager.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.contactmanager.SmartContactManager.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
