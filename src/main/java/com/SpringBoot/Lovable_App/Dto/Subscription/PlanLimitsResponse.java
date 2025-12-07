package com.SpringBoot.Lovable_App.Dto.Subscription;

public record PlanLimitsResponse(
        String name,
        Integer maxTokensPerDay,
        Integer maxProjects,
        Boolean unlimitedAi
) {
}
