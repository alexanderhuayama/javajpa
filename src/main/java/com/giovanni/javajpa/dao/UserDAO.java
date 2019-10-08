package com.giovanni.javajpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.giovanni.javajpa.entity.UserEntity;

@Repository
public interface UserDAO extends JpaRepository<UserEntity, Integer> {
}