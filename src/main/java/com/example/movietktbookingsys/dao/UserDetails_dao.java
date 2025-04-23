package com.example.movietktbookingsys.dao;

import com.example.movietktbookingsys.model.UserDetails;
import com.example.movietktbookingsys.repository.UserDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDetails_dao {

    @Autowired
    public static UserDetailsRepo userDetailsRepo;

    public static UserDetails saveUserDetails(UserDetails userDetails) {
        return userDetailsRepo.save(userDetails);
    }
}
