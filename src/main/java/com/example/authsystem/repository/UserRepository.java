package com.example.authsystem.repository;

import com.example.authsystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername1(Object object);

	Optional<User> findByUsername(Object username);
	Optional<User> findByEmail(String email);
}
