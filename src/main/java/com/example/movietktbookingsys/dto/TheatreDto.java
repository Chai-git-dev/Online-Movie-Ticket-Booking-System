package com.example.movietktbookingsys.dto;

import com.example.movietktbookingsys.model.Theatre;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class TheatreDto {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long theatreId;
    @NotNull(message = "Theatre name cannot be nnull")
    @NotBlank(message = "Theatre name cannot be blank")
    @Pattern(regexp = "[A-Z]{1}[a-zA-Z\\s]*", message = "Name should Start with capital letter")
    private String theatreName;

    public Theatre setTheatreId(String userId) {
        return null;
    }
}
