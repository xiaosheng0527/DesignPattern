package com.atguigu.bridge;

/**
 * @author shengxiao
 * @date 2021/9/10 17:01
 */

// ConcreteImplementor：具体实现者，该角色负责实现在Implementor角色所定义的接口
public class Vivo implements IBrand {
    @Override
    public void open() {
        System.out.println("vivo手机开机了");
    }

    @Override
    public void close() {
        System.out.println("vivo手机关闭了");
    }

    @Override
    public void call() {
        System.out.println("vivo手机打电话");
    }
}
