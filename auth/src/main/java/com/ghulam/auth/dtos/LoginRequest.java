package com.ghulam.auth.dtos;

import jakarta.validation.constraints.NotBlank;

public record LoginRequest(
        @NotBlank
        String mobileNumber,
        @NotBlank
        String password
) {
}
