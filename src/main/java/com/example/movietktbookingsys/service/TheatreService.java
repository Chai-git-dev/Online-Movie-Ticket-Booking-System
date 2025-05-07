package com.example.movietktbookingsys.service;

import com.example.movietktbookingsys.dto.TheaterRequest;
import com.example.movietktbookingsys.dto.TheaterResponse;

public interface TheatreService {
    TheaterResponse addTheater(String email, TheaterRequest theaterRequest);

    TheaterResponse findTheater(String theaterId);

    TheaterResponse updateTheater(String theaterId, TheaterRequest registerationRequest);
}
