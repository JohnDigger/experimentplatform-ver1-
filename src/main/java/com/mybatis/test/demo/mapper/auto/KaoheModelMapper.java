package com.mybatis.test.demo.mapper.auto;

import org.springframework.stereotype.Component;

@Component(value = "kaoheModelMapper")
public interface KaoheModelMapper {
    Integer count();
}
