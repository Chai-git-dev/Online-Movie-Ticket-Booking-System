package com.example.movietktbookingsys.util;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Getter
@Builder
public class ErrorStructure {

    private int statusCode;
    @JsonProperty(namespace = "error_message")
    private String errorMessage;

    @SpringBootApplication
    public static class MovieTicketBookingSystemApiApplication {

        public static void main(String[] args) {
            SpringApplication.run(MovieTicketBookingSystemApiApplication.class, args);
        }

    }
}
