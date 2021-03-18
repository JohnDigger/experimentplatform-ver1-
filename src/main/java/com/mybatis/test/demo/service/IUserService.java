package com.mybatis.test.demo.service;

import com.mybatis.test.demo.model.auto.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface IUserService extends IService<User> {
    public List<User>findAllUser();

    public List<User>findByName(String username);
}
