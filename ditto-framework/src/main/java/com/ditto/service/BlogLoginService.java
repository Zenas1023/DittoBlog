package com.ditto.service;


import com.ditto.domain.ResponseResult;
import com.ditto.domain.entity.User;

public interface BlogLoginService {
    ResponseResult<?> login(User user);
}
