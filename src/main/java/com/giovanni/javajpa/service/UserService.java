package com.giovanni.javajpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giovanni.javajpa.dao.UserDAO;
import com.giovanni.javajpa.entity.UserEntity;

@Service
public class UserService {
    @Autowired
    UserDAO userDao;

    public List<UserEntity> getAllUsers() {
        return this.userDao.findAll();
    }

    public UserEntity addUser(UserEntity user) {
        return this.userDao.save(user);
    }

    public Optional<UserEntity> getUserById(int id) {
        return this.userDao.findById(id);
    }

    public UserEntity updateUser(UserEntity user) {
        return this.userDao.save(user);
    }

    public void deleteUserById(int id) {
        this.userDao.deleteById(id);
    }

    public void deleteAllUsers() {
        this.userDao.deleteAll();
    }

}
