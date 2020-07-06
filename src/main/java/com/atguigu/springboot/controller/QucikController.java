package com.atguigu.springboot.controller;

import com.atguigu.springboot.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @create 2020-07-02 14:56
 */
@RestController//相当于requestmapping+respondy 不在进行视图解析
public class QucikController {
    @Autowired
    User user;
    @Value("${server.port}")
    private  String port;
    @RequestMapping("/quick")
    public String quick(){
        System.out.println(user);
        System.out.println(port);
        return "springboot 访问成功!";
    }

}
