package com.atguigu.visitor;

/**
 * @author shengxiao
 * @date 2021/9/24 20:37
 */

// 说明
// 1. 这里我们使用到了双分派，即首先在客户端中，将具体状态【eg：Action action】作为参数传递Woman（第一次分派）
// 2. 然后Woman 类 调用 作为参数【eg：Action action】的"具体方法" 中 getWoManResult()方法，同时将自己（this）作为参数
//     传入，完成第二次的分派

// 我是感觉 "双分派" 是使用在 两个类【如果是抽象类或者是接口，则需要延伸到具体的子类】之间 的 存在相互依赖，这里刚好 访问者模式符合
// 但不是说相互依赖的情况下就一定要使用到 双分派，这需要在 特定的场合下，eg：Visitor模式，而State模式 虽然存在 "关联关系"，但它们的逻辑代码不需要使用双分派
public class Woman extends Person{
    @Override
    public void accept(Action action) { // 第一次分派
        action.getWoManResult(this);    // 第二次分派，注意：这里的this指向的是 Woman对象，这是由之前的多态，运行时动态绑定
    }
}
