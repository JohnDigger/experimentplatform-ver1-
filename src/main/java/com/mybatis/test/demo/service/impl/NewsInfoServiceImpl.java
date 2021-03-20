package com.mybatis.test.demo.service.impl;

import com.mybatis.test.demo.mapper.auto.NewsInfoMapper;
import com.mybatis.test.demo.service.INewsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsInfoServiceImpl implements INewsInfoService {
    @Autowired
    NewsInfoMapper newsInfoMapper;
    @Override
    public Integer findAllmodelpeople() {
        return newsInfoMapper.findAllmodelpeople()+newsInfoMapper.findAllmodelpeople1();
    }

    @Override
    public Integer findAllpasspeople() {
        return newsInfoMapper.findAllmodelpeople1();
    }

    @Override
    public Integer findAllPass() {
        return newsInfoMapper.findAllPass()+newsInfoMapper.findAllPass1();
    }

    @Override
    public Integer findExcellentpeople() {
        return newsInfoMapper.findExcellentpeople();
    }

    @Override
    public Integer findQualifiedpeople() {
        return newsInfoMapper.findQualifiedpeople();
    }

    @Override
    public Integer findUnqualifiedpeople() {
        return newsInfoMapper.findUnqualifiedpeople();
    }


}
