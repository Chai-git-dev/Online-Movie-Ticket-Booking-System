package com.example.movietktbookingsys.repository;

import com.example.movietktbookingsys.model.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserDetails, String> {

    boolean existsByEmail(String email);
    UserDetails findByEmail(String email);

    }

