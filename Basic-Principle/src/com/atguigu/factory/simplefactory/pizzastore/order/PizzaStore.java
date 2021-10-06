package com.atguigu.factory.simplefactory.pizzastore.order;

/**
 * @author shengxiao
 * @date 2021/9/5 20:45
 */

// 相当于一个客户端，发出订单
public class PizzaStore {

    public static void main(String[] args) {
        //new OrderPizza() ;

        // 使用简单工厂模式
        new OrderPizza(new SimpleFactory()) ;
        System.out.println("~退出程序~");
    }
}
