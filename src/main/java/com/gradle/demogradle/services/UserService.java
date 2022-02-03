package com.gradle.demogradle.services;

import java.util.ArrayList;
import java.util.List;

import com.gradle.demogradle.models.User;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    List<User> list = new ArrayList<>();

    public UserService() {
        list.add(new User("abc", "abc", "abc@gmail.com"));
        list.add(new User("xyz", "xyz", "xyz@gmail.com"));

    }

    public List<User> getAllUsers() {
        return this.list;
    }

    public User getUser(String username) {
        return this.list.stream().filter((user) -> user.getUsername().equals(username)).findAny().orElse(null);
    }

    public User addUser(User user) {
        this.list.add(user);
        return user;
    }

}
