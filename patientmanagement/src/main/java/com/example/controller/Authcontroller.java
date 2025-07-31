package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.User;
import com.example.repository.Userrepository;

@Controller
@RequestMapping("/auth")
public class Authcontroller {

    @Autowired
    private Userrepository userRepo;

    @GetMapping("/")
    public String home() {
        return "login"; 
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody User user) {
        if (userRepo.findbyusername(user.getUsername()) != null) {
            return ResponseEntity.badRequest().body("Username already exists");
        }

        // Save password as plain text (only for testing/dev)
        userRepo.save(user);
        return ResponseEntity.ok("User registered successfully");
    }
    
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody User user) {
        User existing = userRepo.findbyusername(user.getUsername());
        if (existing != null && user.getPassword().equals(existing.getPassword())) {
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.status(401).body("Invalid credentials");
        }
    }

}
