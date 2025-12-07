package com.SpringBoot.Lovable_App.Service.impl;

import com.SpringBoot.Lovable_App.Dto.Subscription.PlanLimitsResponse;
import com.SpringBoot.Lovable_App.Dto.Subscription.UsageTodayResponse;
import com.SpringBoot.Lovable_App.Service.UsageService;
import org.springframework.stereotype.Service;

@Service
public class UsageServiceImpl implements UsageService {

    @Override
    public UsageTodayResponse getTodayUsage(Long userId) {
        return null;
    }

    @Override
    public PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId) {
        return null;
    }
}
