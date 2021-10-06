package com.atguigu.factory.absfactory.pizzastore.order;

import com.atguigu.factory.absfactory.pizzastore.pizza.pizza.*;

/**
 * @author shengxiao
 * @date 2021/9/6 10:30
 */

// 这是一个工厂子类
public class LDFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {

        System.out.println("使用的是抽象工厂模式");
        Pizza pizza = null ;
        if(orderType.equals("cheese")){
            pizza = new LDCheesePizza() ;
        } else if(orderType.equals("pepper")){
            pizza = new LDPepperPizza() ;
        }

        return pizza ;
    }
}
