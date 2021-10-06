package com.atguigu.proxy.static_proxy;

/**
 * @author shengxiao
 * @date 2021/9/21 22:51
 */

// 目标类
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {

        System.out.println("老师授课中。。。");

    }
}
