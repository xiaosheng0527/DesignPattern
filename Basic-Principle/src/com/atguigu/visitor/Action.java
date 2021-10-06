package com.atguigu.visitor;

/**
 * @author shengxiao
 * @date 2021/9/24 20:29
 */

// 注意：这里是 相互 "关联"：Action依赖 Man
//      而在 Man类中，会调用 Action类中的方法，也说明存在依赖关系，故
//      二者之间是相互依赖，即 关联关系

// Action 是 抽象访问者【Visitor】，为该对象结构中的ConcreteElement的每一个类声明一个visit操作
// 注意：这里的 getManResult()方法 和 getWoManResult()方法 就是 类似的visit操作

// 注意：访问者是想要访问 Element角色的实现者，eg：Woman / Man ，
//      主要将数据结构 与 数据操作 分离，解决 数据结构和操作耦合性的问题
public abstract class Action {

    // 得到男性 的 测评
    public abstract void getManResult(Man man) ;

    // 得到女性 的 测评
    public abstract void getWoManResult(Woman woman) ;
}
