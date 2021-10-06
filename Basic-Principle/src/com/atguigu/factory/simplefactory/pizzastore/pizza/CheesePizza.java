package com.atguigu.factory.simplefactory.pizzastore.pizza;

/**
 * @author shengxiao
 * @date 2021/9/5 20:32
 */
public class CheesePizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("给制作奶酪披萨准备原材料");

    }
}
