package com.example.movietktbookingsys.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;

@Entity
public class Theatre {
    @Id
    private String theatreId;
    private String theatreName;
    private String address;
    private String city;
    private String landmark;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private String createdBy;
    private String userId;

    @ManyToOne
    @JoinColumn(name = "theatreOwner_userId")
    private TheatreOwner theatreOwner;

    public void setTheatreId(long theaterId) {
    }
}
