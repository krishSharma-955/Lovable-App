package com.SpringBoot.Lovable_App.Dto.Member;

import com.SpringBoot.Lovable_App.enums.ProjectRole;

public record InviteMemberRequest(
        String email,
        ProjectRole role
) {
}
