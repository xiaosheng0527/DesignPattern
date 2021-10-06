package com.atguigu.strategy.improve;

/**
 * @author shengxiao
 * @date 2021/9/30 23:41
 */

// Strategy角色
// Strategy角色负责决定实现策略所必须的接口
public interface FlyBehavior {

    // 这个抽象方法是子类所共有的
    void fly() ;    // 子类具体实现
}
