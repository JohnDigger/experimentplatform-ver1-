package com.mybatis.test.demo.service.impl;

import com.mybatis.test.demo.model.auto.User;
import com.mybatis.test.demo.mapper.auto.UserMapper;
import com.mybatis.test.demo.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Autowired(required = false)
    private UserMapper userMapper;
    @Override
    public List<User>findAllUser(){
        return userMapper.findAllUser();
    }

    @Override
    public List<User> findByName(String username) {

        return userMapper.findByName(username);
    }

}
