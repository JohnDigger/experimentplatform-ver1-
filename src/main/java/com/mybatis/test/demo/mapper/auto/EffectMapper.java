package com.mybatis.test.demo.mapper.auto;

import com.mybatis.test.demo.model.auto.Effect;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component(value = "effectMapper")
public interface EffectMapper {
    Effect findeffectById(Map param);
}
