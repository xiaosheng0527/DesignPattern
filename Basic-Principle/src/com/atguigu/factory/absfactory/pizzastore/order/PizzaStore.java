package com.atguigu.factory.absfactory.pizzastore.order;

/**
 * @author shengxiao
 * @date 2021/9/6 10:46
 */
public class PizzaStore {

    public static void main(String[] args) {

        //new OrderPizza(new BJFactory()) ;
        new OrderPizza(new LDFactory()) ;
    }
}
