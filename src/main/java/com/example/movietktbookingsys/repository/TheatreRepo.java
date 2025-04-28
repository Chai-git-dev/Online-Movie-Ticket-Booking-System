package com.example.movietktbookingsys.repository;

import com.example.movietktbookingsys.model.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TheatreRepo extends JpaRepository<Theatre, String> {
    List<Theatre> findById(long theatreId);
}
