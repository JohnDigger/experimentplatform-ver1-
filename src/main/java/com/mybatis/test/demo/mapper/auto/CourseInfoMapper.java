package com.mybatis.test.demo.mapper.auto;

import com.mybatis.test.demo.model.auto.CourseInfo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component(value = "courseInfoMapper")
public interface CourseInfoMapper {
    List<CourseInfo> findAll();
}
