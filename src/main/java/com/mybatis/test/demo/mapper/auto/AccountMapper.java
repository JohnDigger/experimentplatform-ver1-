package com.mybatis.test.demo.mapper.auto;

import com.mybatis.test.demo.model.auto.UserAccount;

import java.util.List;

public interface AccountMapper {
    public List<UserAccount> selectUserAccountList();

}
