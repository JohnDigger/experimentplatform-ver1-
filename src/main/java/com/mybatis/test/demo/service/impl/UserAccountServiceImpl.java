package com.mybatis.test.demo.service.impl;

import com.mybatis.test.demo.mapper.auto.AccountMapper;
import com.mybatis.test.demo.model.auto.UserAccount;
import com.mybatis.test.demo.service.IUserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAccountServiceImpl implements IUserAccountService {
    @Autowired(required = false)
    private AccountMapper accountMapper;
    @Override
    public List<UserAccount> getUserAccountList() {
        List<UserAccount> users = accountMapper.selectUserAccountList();
        return users;
    }
}
