package com.ditto.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ditto.domain.ResponseResult;
import com.ditto.domain.entity.User;


/**
 * 用户表(User)表服务接口
 *
 * @author makejava
 * @since 2023-02-13 12:24:20
 */
public interface UserService extends IService<User> {

    ResponseResult<?> userInfo();

}

