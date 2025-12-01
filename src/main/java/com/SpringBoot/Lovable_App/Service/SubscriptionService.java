package com.SpringBoot.Lovable_App.Service;

import com.SpringBoot.Lovable_App.Dto.Subscription.CheckoutRequest;
import com.SpringBoot.Lovable_App.Dto.Subscription.CheckoutResponse;
import com.SpringBoot.Lovable_App.Dto.Subscription.PortalResponse;
import com.SpringBoot.Lovable_App.Dto.Subscription.SubscriptionResponse;
import org.jspecify.annotations.Nullable;

public interface SubscriptionService {
    SubscriptionResponse getCurrentSubscription(Long userId);

    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId);

    PortalResponse openCustomerPortal(Long userId);
}
