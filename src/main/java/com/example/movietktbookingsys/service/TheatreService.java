package com.example.movietktbookingsys.service;

import com.example.movietktbookingsys.dto.TheatreDto;
import com.example.movietktbookingsys.model.Theatre;
import com.example.movietktbookingsys.repository.TheatreRepo;
import com.example.movietktbookingsys.util.ResponseStructure;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TheatreService {

    @Autowired
    private TheatreRepo theatreRepo;


    public Theatre saveTheatre(Theatre theatre) {
        return theatreRepo.save(theatre);
    }

    public Theatre updateTheatre(String theaterId, @Valid TheatreDto theatre) {
        Optional<Theatre> optional=theatreRepo.findById(theaterId);
        if(optional.isPresent()) {
            theatre.setTheatreId(String.valueOf(Long.parseLong(theaterId)));
            return theatreRepo.save(theatre);
        }
        return null;
    }

    public Theatre deleteTheatre(String theatreId) {
        Optional<Theatre> optional = theatreRepo.findById(theatreId);
        if(optional.isPresent()) {

            Theatre theatre=optional.get();
//            theatre.setScreens(null);
//            theatre.setShows(null);
            theatreRepo.delete(theatre);
            return optional.get();
        }
        return null;
    }

    public Theatre getTheatreById(String theatreId) {
        Optional<Theatre> optional=theatreRepo.findById(theatreId);
        return optional.orElse(null);
    }

    public ResponseEntity<ResponseStructure<Theatre>> saveTheatre(String userId, @Valid TheatreDto dto) {
        return null;
    }

    public ResponseEntity<ResponseStructure<Theatre>> findTheatre(String theaterId) {
        return null;
    }
}
