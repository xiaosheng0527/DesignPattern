package com.atguigu.strategy;

/**
 * @author shengxiao
 * @date 2021/9/30 23:20
 */
public class ToyDuck extends Duck{
    @Override
    public void display() {

        System.out.println("玩具鸭");
    }

    // 需要重写父类的所有方法
    public void quack(){
        System.out.println("鸭子不会嘎嘎叫~~");
    }

    public void swim(){
        System.out.println("鸭子不会游泳~~");
    }

    public void fly(){
        System.out.println("鸭子不会飞翔~~~");
    }
}
