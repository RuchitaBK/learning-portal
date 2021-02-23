package com.db.hackathon.learningportal.service;

import com.db.hackathon.learningportal.bean.LoginRequest;
import com.db.hackathon.learningportal.bean.UserRequest;

public interface UserService {
    LoginResponse validateUser(LoginRequest userDetails);

    UserResponse addUser(UserRequest request);

}
