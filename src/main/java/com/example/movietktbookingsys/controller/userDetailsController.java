package com.example.movietktbookingsys.controller;


import com.example.movietktbookingsys.dto.UserRegistrationRequest;
import com.example.movietktbookingsys.model.UserDetails;
import com.example.movietktbookingsys.service.UserDetailsService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/userDetails")
public class userDetailsController {

    @Autowired
    private UserDetailsService userDetailsService;

    @RequestMapping (value = "/save-User", method = RequestMethod.POST)
    @PostMapping
    public ResponseEntity<UserRegistrationRequest> saveUserDetails(@Valid @RequestBody UserDetails user) {
        return userDetailsService.saveUserDetails(user);
    }

}
