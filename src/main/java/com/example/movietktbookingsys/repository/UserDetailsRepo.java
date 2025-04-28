package com.example.movietktbookingsys.repository;

import com.example.movietktbookingsys.model.UserDetails;
import io.micrometer.observation.ObservationFilter;
import jakarta.validation.constraints.Email;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDetailsRepo extends JpaRepository<UserDetails, String> {
    Optional<UserDetails> findById(long userId);
    boolean existsByEmail(@Email String email);

//    String deleteUser(String email);

//    ObservationFilter findByEmail(String email);
}
