package com.atguigu.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shengxiao
 * @date 2021/9/16 21:29
 */
public class College extends OrganizationComponent{

    // List 中存放的是 Department
    // 非叶子节点【Composite】，可以管理Departmet，故这里用一个集合容器来存放 学院所有 的信息
    List<OrganizationComponent> organizationComponents = new ArrayList<>() ;

    // 构造器
    public College(String name, String describe) {
        super(name, describe);

    }

    // 重写add
    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    // 重写remove
    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDescribe() {
        return super.getDescribe();
    }

    // print方法，就是输出University 包含的学院
    @Override
    protected void print() {
        System.out.println("============="+ getName() + "================");
        // 遍历 organizationComponents
        for(OrganizationComponent organizationComponent : organizationComponents){
            organizationComponent.print();
        }
    }
}
