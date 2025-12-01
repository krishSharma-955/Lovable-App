package com.SpringBoot.Lovable_App.Dto.Subscription;

public record PlanResponse(
        Long id,
        String name,
        Integer maxProjects,
        Integer maxTokensPerDay,
        Boolean unlimitedAi,
        Boolean price
) {
}
