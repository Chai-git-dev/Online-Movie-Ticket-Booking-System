package com.example.movietktbookingsys.controller;

import com.example.movietktbookingsys.dto.TheatreDto;
import com.example.movietktbookingsys.model.Theatre;
import com.example.movietktbookingsys.service.TheatreService;
import com.example.movietktbookingsys.util.ResponseStructure;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

public class TheatreController {

    @Autowired
    private TheatreService theatreService;

    @RequestMapping(value = "theatre/save", method = RequestMethod.PUT)
    public ResponseEntity<ResponseStructure<Theatre>> saveTheatre(@RequestParam String userId,
                                                                 @Valid @RequestBody TheatreDto dto) {
        return theatreService.saveTheatre(userId, dto);
    }

    @PutMapping
    public Theatre updateTheatre(@RequestParam String theaterId,
                                 @Valid @RequestBody TheatreDto dto) {
        return theatreService.updateTheatre(theaterId, dto);
    }

    @DeleteMapping
    public Theatre deleteTheatre(@RequestParam String theaterId) {
        return theatreService.deleteTheatre(theaterId);
    }

    @GetMapping
    public ResponseEntity<ResponseStructure<Theatre>> getTheatre(@RequestParam String theaterId) {
        return theatreService.findTheatre(theaterId);
    }
}
