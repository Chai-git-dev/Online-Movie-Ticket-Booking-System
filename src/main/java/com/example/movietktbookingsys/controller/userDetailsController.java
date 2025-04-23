package com.example.movietktbookingsys.controller;


import com.example.movietktbookingsys.dto.UserRegistrationRequest;
import com.example.movietktbookingsys.model.UserDetails;
import com.example.movietktbookingsys.service.UserDetailsService;
import com.example.movietktbookingsys.util.ResponseStructure;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@ResponseBody
public class userDetailsController {

    @Autowired
    private UserDetailsService userDetailsService;

    @RequestMapping (value = "/saveuser", method = RequestMethod.PUT)
    @PostMapping
    public ResponseEntity<ResponseStructure<UserRegistrationRequest>> saveUserDetails(@Valid @RequestBody UserDetails user) {
        return userDetailsService.saveUserDetails(user);
    }

}
