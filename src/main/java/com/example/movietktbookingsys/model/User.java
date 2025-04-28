package com.example.movietktbookingsys.model;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class User {
    @Id
    private String userId;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<UserDetails> userDetails = new ArrayList<>();

//    @OneToMany(mappedBy = "userId")
//    private List<Booking> bookingList;

    public UserDetails getUserRole() {
        return getUserRole();
    }
}
