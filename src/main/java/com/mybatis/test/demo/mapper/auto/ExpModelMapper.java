package com.mybatis.test.demo.mapper.auto;


import com.mybatis.test.demo.model.auto.ExpModel;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component(value = "expModelMapper")
public interface ExpModelMapper {
    List<ExpModel> findAllexp(Map params);
    Integer count();
}
