package com.SpringBoot.Lovable_App.Service.impl;

import com.SpringBoot.Lovable_App.Dto.Auth.AuthResponse;
import com.SpringBoot.Lovable_App.Dto.Auth.LoginRequest;
import com.SpringBoot.Lovable_App.Dto.Auth.SignupRequest;
import com.SpringBoot.Lovable_App.Service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public AuthResponse signup(SignupRequest request) {
        return null;
    }

    @Override
    public AuthResponse login(LoginRequest request) {
        return null;
    }
}
