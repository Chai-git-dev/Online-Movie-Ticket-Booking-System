package com.example.movietktbookingsys.security;

import com.example.movietktbookingsys.model.UserDetails;
import com.example.movietktbookingsys.repository.UserDetailsRepo;
import com.example.movietktbookingsys.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static jdk.internal.classfile.Classfile.build;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserDetailsRepo userDetailsRepo;

    @Autowired
    public SecurityConfig securityConfig;

    public UserDetailsServiceImpl(UserDetailsRepo userDetailsRepo) {
        this.userDetailsRepo = userDetailsRepo;

        userDetailsRepo.findByEmail(Username, )
        UserDetails user = userRepo.findByEmail(Username)
                .orElse Throw(() -> new UsernameNotFoundException(“User not found from this email ID”));
        return User.builder()
                .username(user.getEmail())
                .password(user.getpassword())
                .authorities(user.getUserRole().name())
                .build();

    }
}

