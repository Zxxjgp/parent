package com.example.redission.web;

import org.redisson.api.RBucket;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author jiaoguanping
 * @version 1.0.0
 * @ClassName TestRedisController
 * @date 2020/1/13  17:33
 */
@RestController
@RequestMapping("redis")
public class TestRedisController {

    @Autowired
    private RedissonClient redissonClient;

    @GetMapping("set")
    public String setRedis() {
        RBucket<Object> bucket = redissonClient.getBucket("test1");
        bucket.set("1232132132", 5, TimeUnit.MINUTES);
        return "ok";
    }
}
