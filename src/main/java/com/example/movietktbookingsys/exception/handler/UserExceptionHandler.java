package com.example.movietktbookingsys.exception.handler;

import com.example.movietktbookingsys.util.ErrorStructure;
import com.example.movietktbookingsys.util.ResponseBuilder;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@AllArgsConstructor
public class UserExceptionHandler {

    private final ResponseBuilder responseBuilder;

    @ExceptionHandler
    public ResponseEntity<ErrorStructure> handlerUserExistByEmailException(DuplicateEmailException ex) {
        return responseBuilder.error(HttpStatus.OK, ex.getMessage());
    }

}
