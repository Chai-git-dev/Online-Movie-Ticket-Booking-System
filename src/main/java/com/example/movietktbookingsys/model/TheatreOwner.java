package com.example.movietktbookingsys.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
public class TheatreOwner extends UserDetails {

    @OneToMany(mappedBy = "theatreOwner")
    private List<Theater> theatre;
}
