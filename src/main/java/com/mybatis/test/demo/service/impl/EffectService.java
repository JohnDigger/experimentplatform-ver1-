package com.mybatis.test.demo.service.impl;

import com.mybatis.test.demo.mapper.auto.EffectMapper;
import com.mybatis.test.demo.model.auto.Effect;
import com.mybatis.test.demo.service.IEffectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class EffectService implements IEffectService {

    @Autowired
    EffectMapper effectMapper;
    @Override
    public Effect findById(Map param) {
        Effect effect = new Effect();
        effect = effectMapper.findeffectById(param);
        return effect;
    }
}
