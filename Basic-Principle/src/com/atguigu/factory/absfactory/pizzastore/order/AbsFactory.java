package com.atguigu.factory.absfactory.pizzastore.order;

import com.atguigu.factory.absfactory.pizzastore.pizza.pizza.Pizza;

/**
 * @author shengxiao
 * @date 2021/9/6 10:27
 */

// 一个抽象工厂模式的抽象层（接口）
// 这里的Pizza类就是 抽象工厂  AbsFactory 的 具体子工厂【即生产披萨】
public interface AbsFactory {

    // 让下面的工厂子类来具体实现
    public Pizza createPizza(String orderType) ;
}
