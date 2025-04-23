package com.example.movietktbookingsys.repository;

import com.example.movietktbookingsys.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, String> {
    }

