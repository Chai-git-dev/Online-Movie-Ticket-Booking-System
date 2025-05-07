package com.example.movietktbookingsys.service.impl;

import com.example.movietktbookingsys.dto.TheaterRequest;
import com.example.movietktbookingsys.dto.TheaterResponse;
import com.example.movietktbookingsys.model.Theater;
import com.example.movietktbookingsys.model.TheatreOwner;
import com.example.movietktbookingsys.model.UserDetails;
import com.example.movietktbookingsys.enums.UserRole;
import com.example.movietktbookingsys.exceptions.TheaterNotFoundByIdException;
import com.example.movietktbookingsys.exceptions.UserNotFoundByEmailException;
import com.example.movietktbookingsys.maps.TheatreMap;
import com.example.movietktbookingsys.repository.TheatreRepo;
import com.example.movietktbookingsys.repository.UserRepo;
import com.example.movietktbookingsys.service.TheatreService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TheatreServiceImpl implements TheatreService {


        private final TheatreRepo theaterRepository;
        private final TheatreMap theaterMapper;
        private final UserRepo userRepository;

        @Override
        public TheaterResponse addTheater(String email, TheaterRequest theaterRequest) {

            if (userRepository.existsByEmail(email) && userRepository.findByEmail(email).getUserRole() == UserRole.THEATER_OWNER) {
                UserDetails user = userRepository.findByEmail(email);
                Theater theater = copy(theaterRequest, new Theater(), user);
                return theaterMapper.theaterResponseMapper(theater);
            }
            throw new UserNotFoundByEmailException("No Theater Owner with the provided email is present");
        }

        @Override
        public TheaterResponse findTheater(String theaterId) {
            if(theaterRepository.existsById(theaterId)){
                Theater theater = theaterRepository.findById(theaterId).get();
                return theaterMapper.theaterResponseMapper(theater);
            }
            throw new TheaterNotFoundByIdException("Theater not found by the id");
        }

        @Override
        public TheaterResponse updateTheater(String theaterId, TheaterRequest registerationRequest) {
            if(theaterRepository.existsById(theaterId)) {
                Theater theater = theaterRepository.findById(theaterId).get();
                theater = copy(registerationRequest, theater);
                return theaterMapper.theaterResponseMapper(theater);
            }
            throw new TheaterNotFoundByIdException("Theater not found by id");
        }




        private Theater copy(TheaterRequest registerationRequest, Theater theater, UserDetails userDetails) {
            theater.setAddress(registerationRequest.address());
            theater.setCity(registerationRequest.city());
            theater.setTheatreName(registerationRequest.name());
            theater.setLandmark(registerationRequest.landmark());
            theater.setTheatreOwner((TheatreOwner) userDetails);
            theaterRepository.save(theater);
            return theater;
        }

        private Theater copy(TheaterRequest registerationRequest, Theater theater) {
            theater.setAddress(registerationRequest.address());
            theater.setCity(registerationRequest.city());
            theater.setTheatreName(registerationRequest.name());
            theater.setLandmark(registerationRequest.landmark());
            theaterRepository.save(theater);
            return theater;
        }
}
