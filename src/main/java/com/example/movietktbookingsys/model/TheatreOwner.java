package com.example.movietktbookingsys.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class TheatreOwner {
    @Id
    private String userId;

    @OneToMany(mappedBy = "theatreOwner", cascade = CascadeType.ALL)
    private List<UserDetails> userDetails = new ArrayList<>();

//    @OneToMany(mappedBy = "theatreOwner", cascade = CascadeType.ALL)
//    private List<Theatre> theatres = new ArrayList<>();
}
