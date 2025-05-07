package com.example.movietktbookingsys.service;

import com.example.movietktbookingsys.dto.UserRegistrationRequest;
import com.example.movietktbookingsys.dto.UserResponse;
import com.example.movietktbookingsys.dto.UserUpdationRequest;

public interface UserService {
    UserResponse addUser(UserRegistrationRequest user);

    UserResponse editUser(UserUpdationRequest user, String email);

    UserResponse softDeleteUser(String email);
}
