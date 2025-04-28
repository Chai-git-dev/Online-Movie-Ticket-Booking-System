package com.example.movietktbookingsys.util;

import lombok.*;

@Data
@Builder

@NoArgsConstructor
@AllArgsConstructor

public class ResponseStructure<T> {
    private String message;
    private int status;
    private T data;

}
