package com.example.movietktbookingsys.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class TheatreOwner {
    @Id
    private String userId;
}
