package com.atguigu.visitor;

/**
 * @author shengxiao
 * @date 2021/9/24 20:36
 */

// 表示数据结构的接口，它接受访问者【Visitor】的访问

// Person又称为 Element类【即：被访问对象】 ，定义一个accept方法，接收一个访问者对象【eg：Action的子类】
public abstract class Person {

    // 提供一个方法，让访问者可以访问
    public abstract void accept(Action action) ;

}
