package com.mybatis.test.demo.service;

import com.mybatis.test.demo.model.auto.CourseInfo;

import java.util.List;

public interface ICourseInfoService {
    List<CourseInfo> findAll();
}
