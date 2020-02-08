package com.note.springboot.pojo;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2020/2/1 12:11
 */

@Data
public class User {
    private String id;
    private String username;
    private String password;
}
