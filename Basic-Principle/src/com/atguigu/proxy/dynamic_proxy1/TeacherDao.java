package com.atguigu.proxy.dynamic_proxy1;

/**
 * @author shengxiao
 * @date 2021/9/21 23:16
 */

// 目标对象【被代理对象】
public class TeacherDao implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("老师授课中。。。");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("hello " + name);
    }
}
