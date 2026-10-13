package com.ghulam.auth;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @PostMapping(path = "/register")
    public ResponseEntity<?> register() {
        String message = "Customer registration done.";
        return ResponseEntity.ok(message);
    }

    @PostMapping(path = "/login")
    public ResponseEntity<?> login() {
        String message = "Customer login done.";
        return ResponseEntity.ok(message);
    }

}
