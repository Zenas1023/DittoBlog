package com.ditto.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ditto.domain.entity.User;
import com.ditto.mapper.UserMapper;
import com.ditto.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

/**
 * 用户表(User)表服务实现类
 *
 * @author makejava
 * @since 2023-02-13 12:24:21
 */
@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}

