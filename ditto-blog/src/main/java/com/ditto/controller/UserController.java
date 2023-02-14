package com.ditto.controller;

import com.ditto.domain.ResponseResult;
import com.ditto.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;
    @GetMapping("/userInfo")
    public ResponseResult<?> userInfo(){
        return userService.userInfo();
    }
}
