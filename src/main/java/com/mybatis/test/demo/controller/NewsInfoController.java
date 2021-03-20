package com.mybatis.test.demo.controller;

import com.mybatis.test.demo.api.CommonResult;
import com.mybatis.test.demo.mapper.auto.NewsInfoMapper;
import com.mybatis.test.demo.model.auto.NewsInfo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/newsinfo")
@Api(tags = "NewsInfoController", description = "首页内容管理")
public class NewsInfoController {
    @Autowired
    NewsInfoMapper newsInfoMapper;
    //配置日志框架
    protected static final Logger logger = LoggerFactory.getLogger(NewsInfoController.class);
    @ApiOperation("首页内容的api")
    @GetMapping(value = "/newslist")
    @ResponseBody
    public CommonResult<Map<String,Object>> newslist(@RequestParam(defaultValue = "0",required = true,value = "pageNum")Integer pageNum){
        Map<String,Integer> map = new HashMap<>();
        map.put("pageNum",pageNum);
        //查询所有公告信息
        List<NewsInfo> newsInfos = newsInfoMapper.findAllorderby(map);
        Map<String,Object> map1 = new HashMap<>();
        map1.put("news",newsInfos);
        //查询所有实验列表

        return CommonResult.success(map1);
    }

}
