package com.mybatis.test.demo.mapper.auto;

import com.mybatis.test.demo.model.auto.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Component;

import java.util.List;


@Component(value = "userMapper")
public interface UserMapper extends BaseMapper<User> {
    public List<User> findAllUser();
    public List<User> findByName(String username);

}
