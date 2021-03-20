package com.mybatis.test.demo.mapper.auto;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mybatis.test.demo.model.auto.NewsInfo;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;


@Component(value = "newsInfoMapper")
public interface NewsInfoMapper extends BaseMapper<NewsInfo> {
    List<NewsInfo> findAllorderby(Map params);
}
