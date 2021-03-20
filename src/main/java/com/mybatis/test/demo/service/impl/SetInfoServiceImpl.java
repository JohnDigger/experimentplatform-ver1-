package com.mybatis.test.demo.service.impl;

import com.mybatis.test.demo.mapper.auto.SetInfoMapper;
import com.mybatis.test.demo.model.auto.SetInfo;
import com.mybatis.test.demo.service.ISetInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class SetInfoServiceImpl implements ISetInfoService {
    @Autowired(required = false)
    SetInfoMapper setInfoMapper;
//    @Override
//    public void add(SetInfo setInfo) {
//
//    }

    @Override
    public SetInfo findById(Map param) {
        SetInfo setInfo = setInfoMapper.findById(param);
        return setInfo;
    }
}
