package com;

import cn.hutool.http.HttpUtil;

import java.io.*;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2020/2/19 22:47
 */
public class dmeo {

    public static void main(String[] args) throws IOException {

        System.out.println(Math.round(11.5));
        System.out.println(Math.round(-11.5));


        Date date = new Date();
        date.getTime();
        for(int i=0;i<1000;i++){

            new Thread(() -> {
                while (true){
                    try {
                        HttpUtil.get("https://gitee.com/");

                    }catch (Exception e){
                        System.out.println(1);

                    }

                }
            }).start();
        }



    }
}
