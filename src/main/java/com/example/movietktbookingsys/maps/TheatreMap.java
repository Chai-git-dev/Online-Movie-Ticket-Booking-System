package com.example.movietktbookingsys.maps;

import com.example.movietktbookingsys.dto.TheaterResponse;
import com.example.movietktbookingsys.model.Theater;
import org.springframework.stereotype.Component;

@Component
public class TheatreMap {

    public TheaterResponse theaterResponseMapper(Theater theater) {
        if (theater == null)
            return null;
        return new TheaterResponse(
                theater.getTheatreId(),
                theater.getTheatreName(),
                theater.getAddress(),
                theater.getCity(),
                theater.getLandmark()
        );
    }
}
