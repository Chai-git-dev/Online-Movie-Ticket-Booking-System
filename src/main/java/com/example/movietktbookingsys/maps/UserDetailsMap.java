package com.example.movietktbookingsys.maps;

import com.example.movietktbookingsys.dto.UserResponse;
import com.example.movietktbookingsys.model.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class UserDetailsMap {

    public UserResponse userDetailsResponseMapper(UserDetails userDetails){
        if(userDetails == null)
            return null;
        return new UserResponse(
                userDetails.getUserId(),
                userDetails.getUserName(),
                userDetails.getEmail(),
                userDetails.getPhoneNumber(),
                userDetails.getUserRole()
        );
    }

}

