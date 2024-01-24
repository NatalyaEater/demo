package com.example.demo.controllers;

import com.example.demo.service.UserService;
import com.example.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public String viewUsers(Model model) {
        var users = userService.findAll();
        model.addAttribute("users", users);

        return "users.html";
    }


    @PostMapping("/users")
    public String addUser(
            User u,
            Model model
    ) {
        userService.addUser(u);

        var users = userService.findAll();
        model.addAttribute("users", users);

        return "users.html";
    }
}
