package com.example.movietktbookingsys.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Id;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.Duration;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Movie {
    @Id
    private String movieId;
    private String title;
    private String description;
    private String cast;
    private Duration Runtime;
    private Enum certificate;
    private Enum genre;


}
