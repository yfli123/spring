package com.yfli.redis.test;


import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class RedisTemplateTest {

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    @Test
    public void test(){
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer());
        System.out.println("----------------------------------------------");
        //log.info("redisTemplate.keys : " + redisTemplate.keys("test"));

        Integer d = 12;
        redisTemplate.opsForValue().set("double" , d);
        //redisTemplate.opsForValue().increment("double",12);
        Integer a = 1;
        redisTemplate.opsForValue().increment("double",a);
        log.info(" " + redisTemplate.opsForValue().get("double"));
        System.out.println("-----------------------------------------------");
    }
}
