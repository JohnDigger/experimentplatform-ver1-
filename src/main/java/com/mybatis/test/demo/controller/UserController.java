package com.mybatis.test.demo.controller;


import com.mybatis.test.demo.model.auto.User;
import com.mybatis.test.demo.model.auto.UserAccount;
import com.mybatis.test.demo.model.auto.UserAccountTime;
import com.mybatis.test.demo.service.IUserAccountService;
import com.mybatis.test.demo.service.IUserAccountTime;
import com.mybatis.test.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;
    @Autowired
    private IUserAccountService userAccountService;
    @Autowired
    private IUserAccountTime iUserAccountTime;



    @PostMapping("/getUser")
    public User getUser(){
        return userService.getById(1);
    }

    @PostMapping("/findAllUser")
    public List<User>findAllUser(){

        return userService.findAllUser();
    }
    @GetMapping("/getByName")
    @ResponseBody
    public List<User>findByName(@RequestParam("username") String username){
        return userService.findByName(username);
    }

    @RequestMapping(value = "/useraccountlist",method = RequestMethod.GET)
    public Map<String,Object> allArea(){
        Map<String,Object> modelMap=new HashMap<>();
        List<UserAccount> userAccounts = userAccountService.getUserAccountList();
        modelMap.put("userAccountList",userAccounts);
        return modelMap;
    }
    @RequestMapping(value = "/userTimelist",method = RequestMethod.GET)
    public Map<String,Object> allTime(){
        Map<String,Object> map = new HashMap<>();
        List<UserAccountTime> userAccountTimes = iUserAccountTime.getUserAccountTime();
        map.put("userTime",userAccountTimes);
        return map;
    }
}
