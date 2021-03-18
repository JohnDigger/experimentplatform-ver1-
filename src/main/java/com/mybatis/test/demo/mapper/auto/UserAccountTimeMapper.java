package com.mybatis.test.demo.mapper.auto;

import com.mybatis.test.demo.model.auto.UserAccountTime;

import java.util.List;

public interface UserAccountTimeMapper {
    List<UserAccountTime> selectUserTime();
}
