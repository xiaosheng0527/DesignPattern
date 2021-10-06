package com.atguigu.strategy.improve;

/**
 * @author shengxiao
 * @date 2021/9/30 23:17
 */

// ConcreteContext角色
// ConcreteContext角色 负责使用 Strategy角色。ConcreteContext角色保存了 ConcreteStrategy角色的实例，
//                      并使用 ConcreteStrategy角色去实现需求
public class PekingDuck extends Duck {

    // 写个构造器，传入到FlyBehavior 的 对象
    // 这样的聚合方式也是比较特别，我以为是 先定义一个实例变量，然后利用相应的构造方法
    // 但是：用这种方式来聚合有一个好处，就是，我们不用在客户端调用的使用 创建 具体的策略。
    // 这样不是相当于进行了一层 的封装，其实你要自己在具体的应用上 才能发现 细微的 差距。
    // 我们自己写 肯定没有考虑 太多
    public PekingDuck() {

        flyBehavior = new NoFlyBehavior() ;
    }

    @Override
    public void display() {

        System.out.println("~~北京鸭~~");
    }

    // 因为北京鸭补鞥呢飞翔，因此需要重写fly
    public void fly(){
        System.out.println("北京鸭不能飞翔");
    }


}
