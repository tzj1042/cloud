package com.shuma.feign.controller;

import com.shuma.feign.feign.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试的controller
 *
 * @author tzj
 * @create 2018-05-21 9:36
 **/
@RestController
public class TestController {

    @Autowired
    FeignService feignService;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return feignService.sayHiFromClientOne(name);
    }
}
