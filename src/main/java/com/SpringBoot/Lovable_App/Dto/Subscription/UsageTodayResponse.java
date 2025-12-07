package com.SpringBoot.Lovable_App.Dto.Subscription;

public record UsageTodayResponse(
        Integer tokensUsed,
        Integer tokensLimit,
        Integer previewsRunning,
        Integer previewsLimit
) {
}
