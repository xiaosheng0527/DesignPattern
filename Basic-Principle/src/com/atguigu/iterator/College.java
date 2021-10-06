package com.atguigu.iterator;

import java.util.Iterator;

/**
 * @author shengxiao
 * @date 2021/9/28 16:15
 */
public interface College {

    public String getName() ;

    // 增加系的方法
    public void addDepartment(String name,String desc) ;

    // 返回一个遍历学院下的部门信息的迭代器
    // 为什么 不能返回 College学院的迭代器，因为 在被 封装在集合中，默认实现了Iterator接口，
    // 而且 ConcreteCollege 是聚合了 所属部门信息的 类，故而当然是为 部门信息的遍历提供 迭代器
    public Iterator createIterator() ;
}
