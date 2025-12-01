package com.SpringBoot.Lovable_App.Service;

import com.SpringBoot.Lovable_App.Dto.Auth.AuthResponse;
import com.SpringBoot.Lovable_App.Dto.Auth.LoginRequest;
import com.SpringBoot.Lovable_App.Dto.Auth.SignupRequest;
import org.jspecify.annotations.Nullable;

public interface AuthService {
    AuthResponse signup(SignupRequest request);

    AuthResponse login(LoginRequest request);
}
