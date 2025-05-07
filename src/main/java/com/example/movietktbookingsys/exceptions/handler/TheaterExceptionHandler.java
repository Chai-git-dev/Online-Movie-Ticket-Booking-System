package com.example.movietktbookingsys.exceptions.handler;

import com.example.movietktbookingsys.exceptions.TheaterNotFoundByIdException;
import com.example.movietktbookingsys.util.ErrorStructure;
import com.example.movietktbookingsys.util.ResponseBuilder;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@AllArgsConstructor
public class TheaterExceptionHandler {

    private final ResponseBuilder responseBuilder;

    @ExceptionHandler
    public ResponseEntity<ErrorStructure> handleTheaterNotFoundByIdException(TheaterNotFoundByIdException ex){
        return responseBuilder.error(HttpStatus.NOT_FOUND, ex.getMessage());
    }

}
