package com.example.movietktbookingsys.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;

import java.beans.Customizer;

@Configuration
@Bean
@MethodSecurity
public class SecurityConfig {

    SecurityFilterChain securityFilterChain(HttpSecurity http) {
        //displaying csrf protection
        http.csrf(csrf -> csrf.disable()); //if it shows exception - Make sure we add throws to the method signature 
        

        //specify public & private routes
        http.authorizeHttpRequests(auth -> auth.requestMatches(HttpMethod.POST, "/register")
                .permitAll()
                .anyRequest().authenticated());
        
        //type of authentification to be done
        http.formlogin((Customizer.withDefault());
        
        // return 
        return http.build();

        //Declare a Bean method returning
        @Bean
        public PasswordEncoder passwordEncoder() {
            return new BCryptPasswordEncoder();
        }
    }
}
