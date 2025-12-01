package com.SpringBoot.Lovable_App.Dto.Auth;

public record UserProfileResponse(
        Long id,
        String email,
        String name,
        String avatarUrl
) {
}
