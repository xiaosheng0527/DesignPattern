package com.atguigu.strategy.improve;

/**
 * @author shengxiao
 * @date 2021/9/30 23:14
 */

// Context【上下文】 抽象类，但是其只是定义了负责使用Strategy角色的抽象类，
// 而且只定义了 通常会使用 到 的 普通方法display()【注：子类也可以重写】，
// 以及需要 ConcreteContext中需要 具体实现的 抽象方法，eg：display()
// 具体实现细节 可以 看 ConcreteContext ，而且 ConcreteContext角色保存了ConcreteStrategy角色的实例
// 聚合到 ConcreteContext ，【自然就】 依赖 ConcreteStrategy 角色
public abstract class Duck {

    // 属性，策略接口
    FlyBehavior flyBehavior ;   // 由子类来实例化抽象类对象，而子类也可以共用
    // 其他属性 <-> 策略出口

    // 注意：抽象类的构造方法只能给实例变量赋值，而不能创建对象，
    // 同时而且 抽象类的构造方法 主要是为 子类 服务的
    public Duck(){

    }

    public abstract void display() ;    // 显示鸭子信息

    public void quack(){
        System.out.println("鸭子嘎嘎叫~~");
    }

    public void swim(){
        System.out.println("鸭子会游泳~~");
    }

    // 这个好像很像 Template Method，即 使用父类类型的变量保存子类实例
    // 但还有有些区别，你不要将这个模式生搬硬套，要灵活运用
    public void fly(){

        // 改进
        // 防止：还没有实例化策略对象，此时造成的空指针异常
        // 因为这里使用到聚合，flyBehavior是依附于Duck
        // 当调用 Duck的构造方法时，此时如果没有创建 flyBehavior对象，此时如果直接调用其 fly()方法会造成空指针异常
        if(flyBehavior != null){
            flyBehavior.fly();
        }
    }
}
