package com.example.movietktbookingsys.repository;

import com.example.movietktbookingsys.model.UserDetails;
import jakarta.validation.constraints.Email;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepo extends JpaRepository<UserDetails, String> {
    boolean existsByEmail(@Email String email);
}
