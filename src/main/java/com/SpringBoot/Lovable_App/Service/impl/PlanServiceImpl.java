package com.SpringBoot.Lovable_App.Service.impl;

import com.SpringBoot.Lovable_App.Dto.Subscription.PlanResponse;
import com.SpringBoot.Lovable_App.Service.PlanService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanServiceImpl implements PlanService {

    @Override
    public List<PlanResponse> getAllActivePlans() {
        return List.of();
    }
}
