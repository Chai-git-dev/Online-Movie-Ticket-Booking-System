package com.example.movietktbookingsys.dao;

import com.example.movietktbookingsys.model.User;
import com.example.movietktbookingsys.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class User_dao {

    @Autowired
    private UserRepo userRepo;

    public User saveUser(User user) {
        return userRepo.save(user);
    }
}
