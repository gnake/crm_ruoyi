package com.lzjtugrp2.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
public class RedisTest {
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void testRedis() throws Exception {
        System.out.println("redisTemplate = " + redisTemplate);
        redisTemplate.opsForValue().set("springbootkey","springbootvalue");
        Object springbootavalue = redisTemplate.opsForValue().get("springbootkey");
        System.out.println("springbootavalue = " + springbootavalue);
    }
}
