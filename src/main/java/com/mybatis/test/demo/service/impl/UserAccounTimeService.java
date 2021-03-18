package com.mybatis.test.demo.service.impl;

import com.mybatis.test.demo.mapper.auto.UserAccountTimeMapper;
import com.mybatis.test.demo.model.auto.UserAccountTime;
import com.mybatis.test.demo.service.IUserAccountTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAccounTimeService implements IUserAccountTime {
    @Autowired(required = false)
    UserAccountTimeMapper userAccountTimeMapper;
    @Override
    public List<UserAccountTime> getUserAccountTime() {
        return userAccountTimeMapper.selectUserTime();
    }
}
