package com.SpringBoot.Lovable_App.Dto.Subscription;

public record PlanLimitsResponse(
        String name,
        int maxTokensPerDay,
        int maxProjects,
        boolean unlimitedAi
) {
}
