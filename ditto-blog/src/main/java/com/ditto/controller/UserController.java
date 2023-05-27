package com.ditto.controller;

import com.ditto.annotation.SystemLog;
import com.ditto.domain.ResponseResult;
import com.ditto.domain.entity.User;
import com.ditto.service.UserService;
import org.springframework.web.bind.annotation.*;

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
    @PutMapping("/userInfo")
    @SystemLog(businessName = "更新用户信息")
    public ResponseResult<?> updateUserInfo(@RequestBody User user){
        return userService.updateUserInfo(user);
    }
    @PostMapping("/register")
    public ResponseResult<?> register(@RequestBody User user){
        return userService.register(user);
    }
}
