package com.fh.controller;

import com.fh.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("redis/")
public class RedisController {
    @Autowired
    private RedisUtil redisUtil;
    @RequestMapping("test")
    public String test(String key){
        Object o = redisUtil.get(key);
        return o.toString();
    }
}
