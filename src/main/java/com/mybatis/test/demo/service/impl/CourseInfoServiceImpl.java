package com.mybatis.test.demo.service.impl;

import com.mybatis.test.demo.mapper.auto.CourseInfoMapper;
import com.mybatis.test.demo.model.auto.CourseInfo;
import com.mybatis.test.demo.service.ICourseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseInfoServiceImpl implements ICourseInfoService {
    @Autowired(required = false)
    CourseInfoMapper courseInfoMapper;
    @Override
    public List<CourseInfo> findAll() {
        List<CourseInfo> courseInfos = courseInfoMapper.findAll();
        return courseInfos;
    }
}
