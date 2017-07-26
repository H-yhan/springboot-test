package com.springboot.dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * Created by hyh on 2017/7/26.
 */
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService{
    @Override
    public String login(String name) {
        return "my name is"+name;
    }
}
