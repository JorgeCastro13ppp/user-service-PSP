package com.ejemplo.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.userservice.model.User;
import com.ejemplo.userservice.service.UserService;

@RestController
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping("/user")
    public User getUser() {
        return service.obtenerUsuario();
    }
}
