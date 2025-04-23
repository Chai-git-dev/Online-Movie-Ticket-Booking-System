package com.example.movietktbookingsys.enums;

import com.example.movietktbookingsys.model.TheatreOwner;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public enum UserRole {
    USER,
    THEATREOWNER;

    @Enumerated(EnumType.STRING)
    private UserRole userRole;
}
