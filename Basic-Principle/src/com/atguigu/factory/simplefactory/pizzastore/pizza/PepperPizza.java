package com.atguigu.factory.simplefactory.pizzastore.pizza;

/**
 * @author shengxiao
 * @date 2021/9/5 21:05
 */
public class PepperPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println(" 给胡椒披萨准备原材料 ");
    }
}
