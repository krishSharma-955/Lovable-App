package com.SpringBoot.Lovable_App.Dto.Subscription;

public record UsageResponseToday(
        int tokensUsed,
        int tokensLimit,
        int previewsRunning,
        int previewsLimit
) {
}
