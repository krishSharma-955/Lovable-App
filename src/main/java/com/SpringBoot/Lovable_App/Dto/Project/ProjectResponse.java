package com.SpringBoot.Lovable_App.Dto.Project;

import com.SpringBoot.Lovable_App.Dto.Auth.UserProfileResponse;

import java.time.Instant;

public record ProjectResponse(
        Long id,
        String name,
        Instant createdAt,
        Instant updatedAt,
        UserProfileResponse owner
) {
}
