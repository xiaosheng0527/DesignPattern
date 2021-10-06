package com.atguigu.adapter.class_adapter;

/**
 * @author shengxiao
 * @date 2021/9/9 21:05
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("===类适配器====");
        Phone phone = new Phone() ;
        phone.charging(new VoltageAdapter());
    }
}
