package com.example.movietktbookingsys.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
    @NotNull(message = "user name should not be null")
    private String userName;
    private String email;
    private String password;
    private Enum userRole;
    private long phoneNumber;
    private LocalDate dateOfBirth;
    private long createdAt;
    private long updatedAt;


    @OneToMany(mappedBy = "userdetails")
    private List<User> users;

    @OneToMany(mappedBy = "userdetails")
    private List<TheatreOwner> theatreOwner;

    public UserDetails(String email) {
        this.email = email;
    }

}
