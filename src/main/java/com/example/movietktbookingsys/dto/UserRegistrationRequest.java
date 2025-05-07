package com.example.movietktbookingsys.dto;

import com.example.movietktbookingsys.enums.UserRole;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

public record UserRegistrationRequest (
        @NotNull(message = "User name cannot be null")
        @NotBlank(message = "User name cannot be blank")
        @Pattern(regexp = "[A-Z]{1}[a-zA-Z\\s]*", message = "Name should Start with capital letter")
         String userName,

        @Min(6000000000l)
        @Max(9999999999l)
         String phoneNumber,

        @NotBlank(message = "Email cannot be blank")
        @NotNull(message = "Email cannot be null")
        @Email(regexp = "[a-zA-Z0-9+_.-]+@[g][m][a][i][l]+.[c][o][m]", message = "invalid email--Should be in the extension of '@gmail.com' ")
         String email,

        @NotNull
        @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!]).{8,20}$",
                message = "Password should be minimum of 8 characters and should have atleast one uppercase and lowercase alphabet, atleast one special character")
        String password,


       @NotNull
       UserRole userRole,

        @NotNull
        @Past(message = "Date of birth must be a past date")
        LocalDate dateOfBirth
        ) {}

