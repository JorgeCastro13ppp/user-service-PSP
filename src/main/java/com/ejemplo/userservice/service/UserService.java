package com.ejemplo.userservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ejemplo.userservice.model.User;
import com.ejemplo.userservice.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User crearUsuario(User user) {
        return repository.save(user);
    }

    public List<User> obtenerUsuarios() {
        return repository.findAll();
    }
}
