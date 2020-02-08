package com.note.springboot.service.impl;

import com.note.springboot.pojo.User;
import com.note.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2020/2/1 12:10
 */
@Service
public class UserServiceImpl implements UserService {



    @Override
    public User login(User user) {
        System.out.println(user);




        user.setUsername("业务层添加值");
        return user;
    }
}
