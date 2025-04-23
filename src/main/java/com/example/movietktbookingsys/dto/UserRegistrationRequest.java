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
        Enum userRole,
        long createdAt,
        long updatedAt,
        long phoneNumber) {

        public void setuserId(long userId) {
        }

        public void setuserName(@NotNull(message = "user name should not be null") String userName) {
        }

        public void setemail(@Email String email) {
        }

        public void setuserRole(Enum userRole) {
        }

        public void setphoneNumber(long phoneNumber) {
        }

        public void setcreatedAt(long createdAt) {
        }

        public void setupdatedAt(long updatedAt) {
        }
}
