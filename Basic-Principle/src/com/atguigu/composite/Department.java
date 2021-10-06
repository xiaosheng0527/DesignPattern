package com.atguigu.composite;

/**
 * @author shengxiao
 * @date 2021/9/16 21:32
 */
public class Department extends OrganizationComponent{

    // 没有集合
    // 因为无需用集合容器来存放，这就是叶子节点 【Leaf】

    public Department(String name, String describe) {
        super(name, describe);
    }

    // add，remove 就不用写了，因为他是叶子节点
    @Override
    protected void print() {
        System.out.println(getName());
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDescribe() {
        return super.getDescribe();
    }
}
