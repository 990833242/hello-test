package com.fishpro.helloworld.controller;


import com.fishpro.helloworld.prop.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * helloword示例
 * <pre>
 *     class 上方的 @RequestMapping("/hello") 表示类的路由，即类下所有方法上的路由都是在此路由下面（url）
 * </pre>
 * */
@RequestMapping("/")
@RestController
public class IndexController {

    @Resource
    private Message message;

    @GetMapping
    public String say(){
        return "Hello,demo发布！！！verion-0.0.6 支付宝需求 23/12/29";
    }

    @GetMapping("apollo")
    public String apollo() {
        return message.getResult();
    }
}
