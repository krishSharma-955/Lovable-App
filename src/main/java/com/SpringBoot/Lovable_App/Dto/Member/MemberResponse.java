package com.SpringBoot.Lovable_App.Dto.Member;

import com.SpringBoot.Lovable_App.enums.ProjectRole;

import java.time.Instant;

public record MemberResponse(
        Long id,
        String email,
        String name,
        String avatarUrl,
        ProjectRole role,
        Instant invitedAt
) {
}
