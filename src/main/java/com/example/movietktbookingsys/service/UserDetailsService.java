package com.example.movietktbookingsys.service;

import com.example.movietktbookingsys.exception.handler.DuplicateEmailException;
//import com.example.movietktbookingsys.exception.handler.ResourceNotFoundException;
import com.example.movietktbookingsys.model.UserDetails;
import com.example.movietktbookingsys.repository.UserDetailsRepo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
@AllArgsConstructor
@Getter
@Setter
public class UserDetailsService {
    private final UserDetailsRepo userDetailsRepo;

//    public ResponseEntity<UserRegistrationRequest> saveUserDetails(UserDetails userDetails) {
//
//        ResponseStructure<UserRegistrationRequest> response = new ResponseStructure<>();
//        if (!userDetailsRepo.existsByEmail(userDetails.getEmail())) {
//            UserRegistrationRequest userRegistrationDto = userDetails.UserRegistrationRequest(

    /// /                    userDetails.setUserId(UUID.randomUUID()),
    /// /                    userDetails.getUserName(),
//                    userDetails.getEmail(),
//                    userDetails.getPhoneNumber(),
//                    userDetails.getUserRole(),
//                    userDetails.getCreatedAt(),
//                    userDetails.getUpdatedAt()
//            );
//            return new ResponseEntity<>(userRegistrationDto, HttpStatus.CREATED);
//        }
//        throw new DuplicateEmailException("Email already exists");
//    }

    public ResponseEntity<UserDetails> saveUser(UserDetails userDetails) {
        if (!userDetailsRepo.existsByEmail(userDetails.getEmail())) {
            userDetails.setCreatedAt(new Date());
            userDetails.setUpdatedAt(new Date());
            return new ResponseEntity<>(userDetailsRepo.save(userDetails), HttpStatus.CREATED);
        }
        throw new DuplicateEmailException("Email already exists");
    }

//    public UserDetails deleteUser(String email) {
//        return userDetailsRepo.findByEmail(email)
//                .map(userDetails -> {
//                    userDetailsRepo.deleteUser(String email));
//                return userDetails;
//                })
//                .orElse(null);
//    }

//    public ResponseEntity<UserDetails> deleteUser(UserDetails userDetails) {
//        if(userDetailsRepo.existsByEmail(userDetails.getEmail())) {
//            userDetails.setDeletedAt(new Date());
//        return new ResponseEntity<>(userDetailsRepo.delete(userDetails), HttpStatus.)
//        }
//    }

//    public UserDetails deleteUser(String email) {
//        return userDetailsRepo.findById(email)
//                .map(customer -> {
//                    userDetailsRepo.deleteUser(email);
//                    return customer;
//                })
//                .orElseThrow(() -> new ResourceNotFoundException("Customer not found with ID: " + email));
//    }

}

