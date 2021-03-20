package com.mybatis.test.demo.mapper.auto;

import com.mybatis.test.demo.model.auto.SetInfo;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component("setInfoMapper")
public interface SetInfoMapper {
    public SetInfo findById(Map param);
//    void add(SetInfo setInfo);

}
