package com.atguigu.visitor;

/**
 * @author shengxiao
 * @date 2021/9/24 23:19
 */

// 待定类
// ConcreteVisitor角色，即 Wait，具体的访问者，实现每个由Visitor 声明的操作，是每个操作实现的部分
public class Wait extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println(" 男人给的评价是该 歌手待定。。。");
    }

    @Override
    public void getWoManResult(Woman woman) {
        System.out.println(" 女人给的评价是该 歌手待定。。。");
    }
}
