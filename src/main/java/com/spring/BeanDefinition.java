package com.spring;

public class BeanDefinition {

    // 类型
    private Class clazz;

    // 作用域
    private String scope;

    public Class getClazz() {
        return clazz;
    }

    public String getScope() {
        return scope;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }
}
