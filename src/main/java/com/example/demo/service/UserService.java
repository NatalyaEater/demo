package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserService {

    private List<User> users = new ArrayList<>();

    public List<User> findAll() {
        return users;
    }
    public void addUser(User u) {
        users.add(u);
    }


}
