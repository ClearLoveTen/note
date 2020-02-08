package com.note.springboot.controller;

import com.note.springboot.pojo.User;
import com.note.springboot.redis.RedisHash;
import com.note.springboot.redis.RedisList;
import com.note.springboot.redis.RedisSet;
import com.note.springboot.redis.RedisZSet;
import com.note.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2020/1/30 12:57
 */

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private RedisHash redisHash;
    @Autowired
    private RedisSet redisSet;
    @Autowired
    private RedisZSet redisZSet;
    @Autowired
    private RedisList redisList;

    @RequestMapping("hello")
    public User hello(String username,String password){

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        User user1= userService.login(user);


        redisHash.putAll();
        redisHash.put();
        redisSet.add();
        redisZSet.add();
        redisList.leftPop();
        redisList.leftPushAll();
        return user1;
    }




}
