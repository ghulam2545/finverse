package com.ghulam.auth.dtos;

import jakarta.validation.constraints.NotBlank;

public record RegisterRequest(
        @NotBlank
        String mobileNumber,
        @NotBlank
        String name,
        @NotBlank
        String password
) {
}
