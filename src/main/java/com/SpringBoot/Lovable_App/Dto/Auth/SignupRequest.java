package com.SpringBoot.Lovable_App.Dto.Auth;

public record SignupRequest(
        String email,
        String name,
        String password
) {
}
