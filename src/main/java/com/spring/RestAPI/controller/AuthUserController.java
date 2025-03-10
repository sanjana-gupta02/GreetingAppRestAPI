package com.spring.RestAPI.controller;

import com.spring.RestAPI.dto.AuthUserDTO;
import com.spring.RestAPI.service.AuthenticationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthUserController {


    private final AuthenticationService authenticationService;

    @Autowired
    public AuthUserController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@Valid @RequestBody AuthUserDTO authUserDTO) {
        authenticationService.registerUser(authUserDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body("User registered successfully!");
    }
}