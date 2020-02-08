package com.note.springboot.config.aop;

import com.note.springboot.pojo.User;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2020/2/1 12:07
 */

@Component
@Aspect
public class ServiceAspect {


    /**
     * 定义切入点，切入点为com.example.aop下的所有函数
     * 访问权限，返回值，类路径                        任意参数
     */
    @Pointcut("execution(public * com.note.springboot.service..*.*(..))")
    public void UserService() {


    }

    @Before("UserService()")
    public void befor() {
        System.out.println("执行之前");
    }

    @Around("UserService()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {


        Object[] args = joinPoint.getArgs();

        if (args[0] instanceof User) {

            User user = (User) args[0];
            user.setId("AOP进行了改变");


            args[0] = user;

        }

        return joinPoint.proceed(args);


    }

}
