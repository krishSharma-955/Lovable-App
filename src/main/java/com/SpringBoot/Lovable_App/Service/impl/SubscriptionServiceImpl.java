package com.SpringBoot.Lovable_App.Service.impl;

import com.SpringBoot.Lovable_App.Dto.Subscription.CheckoutRequest;
import com.SpringBoot.Lovable_App.Dto.Subscription.CheckoutResponse;
import com.SpringBoot.Lovable_App.Dto.Subscription.PortalResponse;
import com.SpringBoot.Lovable_App.Dto.Subscription.SubscriptionResponse;
import com.SpringBoot.Lovable_App.Service.SubscriptionService;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {

    @Override
    public SubscriptionResponse getCurrentSubscription(Long userId) {
        return null;
    }

    @Override
    public CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId) {
        return null;
    }

    @Override
    public PortalResponse openCustomerPortal(Long userId) {
        return null;
    }
}
