package com.shuma.user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户服务测试
 */
@RestController
public class IndexController {


    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        TestModel testModel=new TestModel();
        return "hi "+name+"，服务端口为:" +port;
    }
}
