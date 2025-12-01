package com.SpringBoot.Lovable_App.Service;

import com.SpringBoot.Lovable_App.Dto.Subscription.PlanLimitsResponse;
import com.SpringBoot.Lovable_App.Dto.Subscription.UsageResponseToday;
import org.jspecify.annotations.Nullable;

public interface UsageService {
    UsageResponseToday getTodayUsage(Long userId);

    PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId);
}
