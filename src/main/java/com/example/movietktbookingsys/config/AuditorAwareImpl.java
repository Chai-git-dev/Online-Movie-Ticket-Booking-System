package com.example.movietktbookingsys.config;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties;
import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import javax.swing.text.html.Option;
import java.util.Optional;

import static sun.awt.image.MultiResolutionCachedImage.map;

@Component // auditorAwareImpl (Bean)
public class AuditorAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        String username = Optional.ofNullable(SecurityContextHolder.getContext().getAuthentication())
        Optional < CouchbaseProperties.Authentication >
        .map(Authentication auth -> auth.getName()) Optional < String >
        .orElse(other:"System");
        return Optional.of(username);
    }}

