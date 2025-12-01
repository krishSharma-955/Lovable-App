package com.SpringBoot.Lovable_App.Dto.Auth;

public record LoginRequest(
        String email,
        String password
) {
}
