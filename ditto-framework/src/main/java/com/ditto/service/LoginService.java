package com.ditto.service;

import com.ditto.domain.ResponseResult;
import com.ditto.domain.entity.User;

public interface LoginService {
    ResponseResult login(User user);

}