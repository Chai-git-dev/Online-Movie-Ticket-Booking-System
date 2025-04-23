package com.example.movietktbookingsys.service;

import com.example.movietktbookingsys.dao.UserDetails_dao;
import com.example.movietktbookingsys.dto.UserRegistrationRequest;
import com.example.movietktbookingsys.exception.handler.DuplicateEmailException;
import com.example.movietktbookingsys.model.UserDetails;
import com.example.movietktbookingsys.repository.UserDetailsRepo;
import com.example.movietktbookingsys.util.ResponseStructure;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Getter
@Setter
public class UserDetailsService {
    private final UserDetailsRepo userDetailsRepo;


    @Autowired
    private UserDetails_dao userDetails_dao;
    @Autowired
    private UserRegistrationRequest userRegistrationRequest;

    public ResponseEntity<ResponseStructure<UserRegistrationRequest>> saveUserDetails(UserDetails user) {
        ResponseStructure<UserRegistrationRequest> response = new ResponseStructure<>();
        if (!userDetailsRepo.existsByEmail(user.getEmail())) {
            userRegistrationRequest.setuserId(user.getUserId());
            userRegistrationRequest.setuserName(user.getUserName());
            userRegistrationRequest.setemail(user.getEmail());
            userRegistrationRequest.setuserRole(user.getUserRole());
            userRegistrationRequest.setphoneNumber(user.getPhoneNumber());
            userRegistrationRequest.setcreatedAt(user.getCreatedAt());
            userRegistrationRequest.setupdatedAt(user.getUpdatedAt());
            return new ResponseEntity<ResponseStructure<UserRegistrationRequest>>(response, HttpStatus.CREATED);
        }
        throw new DuplicateEmailException("Email already exists");

    }
}

//    public UserDetails save(UserDetails userDetails) throws DuplicateEmailException {
//        if(UserDetailsRepo.existsByEmail(userDetails.getEmail())) {
//            throw new DuplicateEmailException("Email already exists: " +userDetails.getEmail());
//        }
//        if (userDetails.getUserId()) == null) {
//            userDetails.setUserId(UUID.randomUUID());
//        }
//
//        userDetails.getUserName()
//                return;

