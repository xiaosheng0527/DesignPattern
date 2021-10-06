package com.atguigu.factory.simplefactory.pizzastore.pizza;

/**
 * @author shengxiao
 * @date 2021/9/5 20:36
 */
public class GreekPizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("给希腊披萨准备原材料");
    }
}
