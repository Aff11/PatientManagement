package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.User;
import com.example.repository.Userrepository;

@Service
public class UserService {
     
     @Autowired
     private Userrepository userRepository;

     public boolean login(String username, String password) {
         User user = userRepository.findbyusername(username);
         return user != null && password.equals(user.getPassword()); 
     }

     public void register(User user) {
         userRepository.save(user); 
     }

     public void saveUser(User user) {
         userRepository.save(user); 
     }
     
     
}
