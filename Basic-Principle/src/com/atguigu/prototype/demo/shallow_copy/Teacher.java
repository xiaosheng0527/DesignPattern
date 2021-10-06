package com.atguigu.prototype.demo.shallow_copy;

/**
 * @author shengxiao
 * @date 2021/9/8 16:52
 */
class Teacher implements Cloneable {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
