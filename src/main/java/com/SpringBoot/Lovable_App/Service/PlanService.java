package com.SpringBoot.Lovable_App.Service;

import com.SpringBoot.Lovable_App.Dto.Subscription.PlanResponse;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface PlanService {
    List<PlanResponse> getAllActivePlans();
}
