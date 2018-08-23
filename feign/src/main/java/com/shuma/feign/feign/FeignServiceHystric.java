package com.shuma.feign.feign;

import org.springframework.stereotype.Component;

/**
 * 熔断器
 *
 * @author tzj
 * @create 2018-05-21 10:36
 **/
@Component
public class FeignServiceHystric implements FeignService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry 已经挂了，无法访问！"+name;
    }
}
