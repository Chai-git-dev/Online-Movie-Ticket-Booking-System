package com.example.movietktbookingsys.dao;

import com.example.movietktbookingsys.model.TheatreOwner;
import com.example.movietktbookingsys.repository.TheatreOwnerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TheatreOwner_dao {
    
    @Autowired
    private TheatreOwnerRepo repo;
    
    public TheatreOwner saveTheatreOwner(TheatreOwner theatreOwner) {
        return repo.save(theatreOwner);
    }

}
