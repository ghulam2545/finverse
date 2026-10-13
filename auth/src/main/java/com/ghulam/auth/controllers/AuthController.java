package com.ghulam.auth.controllers;

import com.ghulam.auth.dtos.LoginRequest;
import com.ghulam.auth.dtos.RegisterRequest;
import com.ghulam.auth.service.CustomerService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    private final CustomerService customerService;

    public AuthController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping(path = "/register")
    public ResponseEntity<?> register(@Valid @RequestBody RegisterRequest registerRequest) {
        var out = customerService.register(registerRequest);
        String message = out ? "Customer registration done." : "Customer registration failed.";
        return ResponseEntity.ok(message);
    }

    @PostMapping(path = "/login")
    public ResponseEntity<?> login(@Valid @RequestBody LoginRequest loginRequest) {
        var out = customerService.login(loginRequest);
        String message = out ? "Customer login done." : "Customer login failed.";
        return ResponseEntity.ok(message);
    }

}
