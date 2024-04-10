package com.example.usermanagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.usermanagement.model.User;
import com.example.usermanagement.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {
    
	private UserRepository userRepository;

	public UserController (UserRepository userRepository) {
		this.userRepository = userRepository;
	}

    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{userId}")
    public ResponseEntity<?> getUserById(@PathVariable String userId) {
        Optional<User> user = userRepository.findById(userId);
        
        if (user.isPresent()) {
            return ResponseEntity.ok().body(user.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userRepository.save(user);
    }
    
}
