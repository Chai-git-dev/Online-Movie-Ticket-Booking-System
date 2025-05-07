package com.example.movietktbookingsys.service.impl;

import com.example.movietktbookingsys.dto.UserRegistrationRequest;
import com.example.movietktbookingsys.dto.UserResponse;
import com.example.movietktbookingsys.dto.UserUpdationRequest;
import com.example.movietktbookingsys.model.User;
import com.example.movietktbookingsys.model.TheatreOwner;
import com.example.movietktbookingsys.model.UserDetails;
import com.example.movietktbookingsys.exceptions.UserExistByEmailException;
import com.example.movietktbookingsys.exceptions.UserNotFoundByEmailException;
import com.example.movietktbookingsys.maps.UserDetailsMap;
import com.example.movietktbookingsys.repository.UserRepo;
import com.example.movietktbookingsys.security.SecurityConfig;
import com.example.movietktbookingsys.service.UserService;
import lombok.AllArgsConstructor;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepo userRepository;
    private final UserDetailsMap userMapper;
//    private final PasswordEncoder passwordEncoder;

    @Override
    public UserResponse addUser(UserRegistrationRequest user) {
        if (userRepository.existsByEmail(user.email()))
            throw new UserExistByEmailException("User with the Email is already exists");

        UserDetails userDetails = switch (user.userRole()) {
            case USER -> copy(new User(), user);
            case THEATER_OWNER -> copy(new TheatreOwner(), user);
        };
        return userMapper.userDetailsResponseMapper(userDetails);

    }

    @Override
    public UserResponse editUser(UserUpdationRequest userRequest, String email) {
        if (userRepository.existsByEmail(email)) {
            UserDetails user = userRepository.findByEmail(email);

            if (! user.getEmail().equals(userRequest.email()) && userRepository.existsByEmail(userRequest.email())){
                throw new UserExistByEmailException("User with the email already exists");
            }


            user = copy(user, userRequest);

            return userMapper.userDetailsResponseMapper(user);
        }

        throw new UserNotFoundByEmailException("Email not found in the Database");

    }

    @Override
    public UserResponse softDeleteUser(String email) {
        if (userRepository.existsByEmail(email)) {
            UserDetails user = userRepository.findByEmail(email);
            user.setDelete(true);
            user.setDeletedAt(Instant.now());
            userRepository.save(user);
            return userMapper.userDetailsResponseMapper(user);
        }
        throw new UserNotFoundByEmailException("Email not found in the Database");
    }

    private UserDetails copy(UserDetails userRole, UserRegistrationRequest user) {
        userRole.setUserRole(user.userRole());
        userRole.setPassword(passwordEncoder.encode(user.password()));
        userRole.setEmail(user.email());
        userRole.setDateOfBirth(user.dateOfBirth());
        userRole.setPhoneNumber(user.phoneNumber());
        userRole.setUserName(user.userName());
        userRole.setDelete(false);
        userRepository.save(userRole);
        return userRole;
    }

    private UserDetails copy(UserDetails userRole, UserUpdationRequest user) {
        userRole.setDateOfBirth(user.dateOfBirth());
        userRole.setPhoneNumber(user.phoneNumber());
        userRole.setEmail(user.email());
        userRole.setUserName(user.username());
        userRole.setDelete(false);
        userRepository.save(userRole);
        return userRole;
    }
}