package com.atguigu.strategy.improve;

/**
 * @author shengxiao
 * @date 2021/9/30 23:41
 */

// 角色：ConcreteStrategy
//  ConcreteStrategy角色负责实现Strategy角色的接口，即负责实现具体的策略（战略，方向，方法，算法）
public class GoodFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println(" 飞翔技术高超~~");
    }
}
