package com.example.movietktbookingsys.model;

import com.example.movietktbookingsys.dto.UserRegistrationRequest;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Getter
@Setter
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
    private String userName;
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)
    private UserRole userRole;
    private String phoneNumber;
    private LocalDate dateOfBirth;
    private Date createdAt;
    private Date updatedAt;
//    private Date deletedAt;

    @ManyToOne
    @JoinColumn(name = "user_userId")
    private User user;

    @ManyToOne
    @JoinColumn(name = "theatreOwner_userId")
    private TheatreOwner theatreOwner;

//    public long setUserId(UUID uuid) {
//        long userId = uuid.getMostSignificantBits();
//        this.userId = userId;
//        return userId;
//    }

    public UserRegistrationRequest UserRegistrationRequest(long userId, String userName, String email, String phoneNumber, UserRole userRole, long createdAt, long updatedAt) {
        UserRegistrationRequest UserRegistrationRequest = new UserRegistrationRequest();
        return UserRegistrationRequest;
    }

    public enum UserRole{
        USER,
        THEATRE_OWNER
    }
}
