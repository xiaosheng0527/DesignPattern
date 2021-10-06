package com.atguigu.visitor;

/**
 * @author shengxiao
 * @date 2021/9/24 20:42
 */

// ConcreteVisitor角色，即Fail，具体的访问者，实现每个由Visitor 声明的操作，是每个操作实现的部分
public class Fail extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println("男人给的评价是 该歌手失败");
    }

    @Override
    public void getWoManResult(Woman woman) {
        System.out.println("女人给的评价是 该歌手失败");
    }
}
