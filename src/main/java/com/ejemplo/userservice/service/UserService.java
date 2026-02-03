package com.ejemplo.userservice.service;

import org.springframework.stereotype.Service;
import com.ejemplo.userservice.model.User;

@Service
public class UserService {

    public User obtenerUsuario() {
        return new User(1L, "Jorge", "jorge@email.com");
    }
}

