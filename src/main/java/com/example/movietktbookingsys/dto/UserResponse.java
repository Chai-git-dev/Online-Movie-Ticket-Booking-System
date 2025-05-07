package com.example.movietktbookingsys.dto;

import com.example.movietktbookingsys.enums.UserRole;
import lombok.Builder;

@Builder
public record UserResponse (
        long userId,
        String username,
        String email,
        String phoneNumber,
        UserRole userRole
){ }
