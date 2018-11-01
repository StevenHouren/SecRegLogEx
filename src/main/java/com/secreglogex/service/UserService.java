package com.secreglogex.service;

import com.secreglogex.model.User;

public interface UserService {
  
 public User findUserByEmail(String email);
 
 public void saveUser(User user);
}