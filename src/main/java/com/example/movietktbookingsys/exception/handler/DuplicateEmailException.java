package com.example.movietktbookingsys.exception.handler;

import lombok.Getter;

@Getter
public class DuplicateEmailException extends RuntimeException {
    private String message;
    public DuplicateEmailException(String message) {this.message=message; }
}
