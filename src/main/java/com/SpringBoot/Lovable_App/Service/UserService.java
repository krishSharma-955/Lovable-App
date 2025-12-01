package com.SpringBoot.Lovable_App.Service;

import com.SpringBoot.Lovable_App.Dto.Auth.UserProfileResponse;

public interface UserService {
    UserProfileResponse getProfile(Long userId);
}
