package com.ejemplo.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ejemplo.userservice.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
