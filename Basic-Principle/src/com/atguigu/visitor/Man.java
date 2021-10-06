package com.atguigu.visitor;

/**
 * @author shengxiao
 * @date 2021/9/24 20:37
 */
// Man 类 依赖 Action 类
// 如何你不清楚什么情况下是依赖，你可以去看看PPT里面对依赖的讲解
// 其实对依赖的理解 我们可以不用细究，因为类与类之间稍微有擦点边都算有使用到，就是依赖

// ConcreteElement -- Man ：具体的元素，实现了 accept方法
public class Man extends Person{
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
