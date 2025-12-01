package com.SpringBoot.Lovable_App.Dto.Auth;

public record AuthResponse(
        String token,
        UserProfileResponse user
) {
}
