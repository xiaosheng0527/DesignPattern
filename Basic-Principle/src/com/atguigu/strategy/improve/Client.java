package com.atguigu.strategy.improve;

/**
 * @author shengxiao
 * @date 2021/9/30 23:53
 */
public class Client {

    public static void main(String[] args) {
        Duck wildDuck = new WildDuck() ;
        wildDuck.fly() ;
        wildDuck.fly() ;

        Duck toyDuck = new ToyDuck() ;
        toyDuck.fly();

        Duck pekingDuck = new PekingDuck() ;
        pekingDuck.fly() ;

        // 动态改变某个对象的行为， 北京鸭 不能飞
//        pekingDuck
    }
}
