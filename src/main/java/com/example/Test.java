package com.example;

import com.example.service.UserService;
import com.spring.ZzhApplicationContext;

public class Test {
    public static void main(String[] args) {
        ZzhApplicationContext applicationContext = new ZzhApplicationContext(AppConfig.class);
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.test();
    }
}
