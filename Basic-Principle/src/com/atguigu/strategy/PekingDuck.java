package com.atguigu.strategy;

/**
 * @author shengxiao
 * @date 2021/9/30 23:17
 */
public class PekingDuck extends Duck{


    @Override
    public void display() {

        System.out.println("~~北京鸭~~");
    }

    // 因为北京鸭补鞥呢飞翔，因此需要重写fly
    public void fly(){
        System.out.println("北京鸭不能飞翔");
    }
}
