package com.example.movietktbookingsys.controller;


import com.example.movietktbookingsys.model.UserDetails;
import com.example.movietktbookingsys.service.UserDetailsService;
import com.example.movietktbookingsys.util.ResponseBuilder;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RestControllerAdvice
public class userDetailsController {

    private final UserDetailsService userDetailsService;
//    private final ResponseBuilder responseBuilder;


    @RequestMapping(value = "user/save", method = RequestMethod.PUT)
    public ResponseEntity<UserDetails> saveUserDetails(@Valid @RequestBody
                                                                       UserDetails userDetails) {
        System.out.println("Api is ready to use");
//        return userDetailsService.saveUserDetails(userDetails);
        return userDetailsService.saveUser(userDetails);

    }

//    @RequestMapping(value = "user/delete", method = RequestMethod.DELETE)
//    public ResponseEntity<UserDetails> deleteById(long userId) {
//        return userDetailsService.deleteUser(userId, deleteUser);
//    }
//
//    @RequestMapping(value = "user/delete", method = RequestMethod.DELETE)
//    public ResponseEntity<String> deleteUser(String email) {
//        UserDetails dltUser = userDetailsService.deleteUser(String.valueOf(email));
//
//        if(dltUser != null) {
//            String deletedUserDetails = null;
//            return ResponseEntity.ok(deletedUserDetails);
//        } else {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND)
//                    .body("User with Id: "+ email + "not found.");
//        }
//    }

//    @DeleteMapping("user/{email}")
//    public UserDetails deleteUser(@RequestBody String email) {
//        return userDetailsService.deleteById(Long.parseLong(email));
//    }
}
