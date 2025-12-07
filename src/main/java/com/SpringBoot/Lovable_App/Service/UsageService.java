package com.SpringBoot.Lovable_App.Service;

import com.SpringBoot.Lovable_App.Dto.Subscription.PlanLimitsResponse;
import com.SpringBoot.Lovable_App.Dto.Subscription.UsageTodayResponse;

public interface UsageService {
    UsageTodayResponse getTodayUsage(Long userId);

    PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId);
}
