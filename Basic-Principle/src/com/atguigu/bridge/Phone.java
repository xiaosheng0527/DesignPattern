package com.atguigu.bridge;

/**
 * @author shengxiao
 * @date 2021/9/10 17:02
 */

// 作为桥梁
// Abstraction【抽象化】，该角色位于 "类的功能层次结构"的最上层
public abstract class Phone {

    // 聚合品牌
    // Implementor【实现者】，该角色位于 "类的实现层次结构"的最上层
    private IBrand brand ;

    // 构造器
    public Phone(IBrand brand) {
        this.brand = brand;
    }

    protected void open(){
        this.brand.open();
    }

    protected void close(){
        this.brand.close();
    }

    protected void call(){
        this.brand.call();
    }
}
