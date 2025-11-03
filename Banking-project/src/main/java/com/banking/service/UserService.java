package com.banking.service;

import com.banking.dto.RegisterRequest;
import com.banking.model.User;

public interface UserService {
    User register(RegisterRequest request);
    User findByEmail(String email);
}
