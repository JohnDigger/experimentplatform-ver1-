package com.mybatis.test.demo.service;

import com.mybatis.test.demo.model.auto.Effect;

import java.util.Map;

public interface IEffectService {
    Effect findById(Map param);
}
