package com.example.movietktbookingsys.repository;

import com.example.movietktbookingsys.model.Theater;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheatreRepo extends JpaRepository<Theater, String> {

//    List<Theatre> findById(long theatreId);
}
