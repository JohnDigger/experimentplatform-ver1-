package com.mybatis.test.demo.mapper.auto;

import org.springframework.stereotype.Component;

@Component("teacherMapper")
public interface TeacherMapper {
    Integer count();
}
