package com.example.Barebones.service;

/*
  Where did UserDetailsService come from??
  ========================================
  UserService interface extends UserDetailsService to leverage
  Spring Security's authentication mechanism.

What is UserDetailsService?
A core interface in Spring Security.
Responsible for retrieving user-related data (username,
password, authorities) from a backend data source (like a database).
Used by the DaoAuthenticationProvider to load user details during authentication.
How Your Code Works:
Your UserServiceImpl class implements the UserDetailsService interface.
The loadUserByUsername method in UserServiceImpl is where you would
typically fetch user information from your database based on the provided
username (email in your case).
The method then creates a UserDetails object containing user details
(username, password, authorities) and returns it to Spring Security for authentication.

 */

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.Barebones.model.User;
import com.example.Barebones.repo.UserRegistrationDto;

public interface UserService extends UserDetailsService {
   User findByEmail(String email);
   User save(UserRegistrationDto registration);
}
