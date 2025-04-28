package com.example.movietktbookingsys.dto;

import com.example.movietktbookingsys.model.UserDetails;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class UserRegistrationRequest {
        @NotNull(message = "User name cannot be null")
        @NotBlank(message = "User name cannot be blank")
        @Pattern(regexp = "[A-Z]{1}[a-zA-Z\\s]*", message = "Name should Start with capital letter")
        private String userName;

        @Min(6000000000l)
        @Max(9999999999l)
        private String phoneNumber;

        @NotBlank(message = "Email cannot be blank")
        @NotNull(message = "Email cannot be null")
        @Email(regexp = "[a-zA-Z0-9+_.-]+@[g][m][a][i][l]+.[c][o][m]", message = "invalid email--Should be in the extension of '@gmail.com' ")
        private String email;

        UserDetails.UserRole userRole;

        LocalDate dateOfBirth;
}
