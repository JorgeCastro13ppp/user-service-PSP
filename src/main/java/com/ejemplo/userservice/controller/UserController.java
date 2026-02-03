package com.ejemplo.userservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.ejemplo.userservice.model.User;
import com.ejemplo.userservice.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    // GET -> todos
    @GetMapping
    public List<User> getUsers() {
        return service.obtenerUsuarios();
    }

    // POST -> guardar
    @PostMapping
    public User crearUser(@RequestBody User user) {
        return service.crearUsuario(user);
    }
}
