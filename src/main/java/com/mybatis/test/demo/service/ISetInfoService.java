package com.mybatis.test.demo.service;

import com.mybatis.test.demo.model.auto.SetInfo;

import java.util.Map;

public interface ISetInfoService {
//    void add(SetInfo setInfo);

    SetInfo findById(Map param);
}
