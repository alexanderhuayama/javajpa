package com.giovanni.javajpa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.giovanni.javajpa.entity.UserEntity;
import com.giovanni.javajpa.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<UserEntity> getAllUsers() {
        return this.userService.getAllUsers();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public UserEntity addUser(@RequestBody UserEntity user) {
        return this.userService.addUser(user);
    }

    @RequestMapping(value = "/", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public UserEntity updateUser(@RequestBody UserEntity user) {
        return this.userService.updateUser(user);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<UserEntity> getUser(@PathVariable int id) {
        return this.userService.getUserById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable int id) {
        this.userService.deleteUserById(id);
    }
}