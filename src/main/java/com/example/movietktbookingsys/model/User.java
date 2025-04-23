package com.example.movietktbookingsys.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class User {
    public static final UserDetails USER = null;
    @Id
    private String userId;

    @OneToOne(mappedBy = "user")
    private UserDetails userDetails;

    @OneToMany(mappedBy = "user")
    private List<Booking> bookingList;

    public UserDetails getUserRole() {
        return getUserRole();
    }
}
