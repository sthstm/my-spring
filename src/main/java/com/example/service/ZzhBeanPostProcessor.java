package com.example.service;

import com.spring.BeanPostProcessor;
import com.spring.Component;

@Component
public class ZzhBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        System.out.println("before initializing");
        if (beanName.equals("userService")) {
            ((UserService)bean).setBeanName("hello");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {
        System.out.println("initialized");
        return bean;
    }
}
