package com.atguigu.proxy.cglib;

/**
 * @author shengxiao
 * @date 2021/9/22 15:37
 */
public class TeacherDao {

    public String teach() {
        System.out.println("老师授课中，我是cglib代表，不需要事先接口");
        return "hello" ;
    }
}
