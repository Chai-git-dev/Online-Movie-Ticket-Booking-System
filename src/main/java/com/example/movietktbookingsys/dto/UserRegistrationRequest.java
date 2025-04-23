package com.example.movietktbookingsys.dto;

import com.example.movietktbookingsys.service.UserDetailsService;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Contract;

import java.time.LocalDate;

public record UserRegistrationRequest(
        String userName,
        @Email (regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\\\.[a-z]{2,3}", message = "invalid email/duplicate Email ")
        String email,
        String phNum,
        String password,
        Enum userRole,
        long createdAt,
        long updatedAt,
        LocalDate dateOfBirth,
        long phoneNumber) {
        public UserRegistrationRequest() {

        }
//        public UserRegistrationRequest() {
//        }

        public void setuserId(long userId) {
        }

        public void setuserName(@NotNull(message = "user name should not be null") String userName) {
        }

        public void setemail(@Email String email) {
        }

        public void setpassword(String password) {
        }

        public void setuserRole(Enum userRole) {
        }

        public void setphoneNumber(long phoneNumber) {
        }

        public void setdateOfBirth(LocalDate dateOfBirth) {
        }

        public void setcreatedAt(long createdAt) {
        }

        public void setupdatedAt(long updatedAt) {
        }
}
