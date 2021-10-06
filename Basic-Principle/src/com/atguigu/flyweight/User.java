package com.atguigu.flyweight;

/**
 * @author shengxiao
 * @date 2021/9/21 21:28
 */
public class User {

    private String name ;

    public User(String name) {
        this.name = name;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
