package com.SpringBoot.Lovable_App.Service.impl;

import com.SpringBoot.Lovable_App.Dto.Auth.UserProfileResponse;
import com.SpringBoot.Lovable_App.Service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserProfileResponse getProfile(Long userId) {
        return null;
    }
}
