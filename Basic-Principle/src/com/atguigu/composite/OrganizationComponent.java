package com.atguigu.composite;

/**
 * @author shengxiao
 * @date 2021/9/16 21:05
 */
public abstract class OrganizationComponent {

    private String name ;   // 名字
    private String describe ;    // 说明

    public OrganizationComponent() {
    }

    public OrganizationComponent(String name, String describe) {
        this.name = name;
        this.describe = describe;
    }

    protected void add(OrganizationComponent organizationComponent){
        // 默认实现
        // 这里抛出 不可操作 异常
        throw new UnsupportedOperationException() ;
    }

    protected void remove(OrganizationComponent organizationComponent){
        // 默认实现
        // 这里抛出 不可操作 异常
        throw new UnsupportedOperationException() ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    // 方法print，做成抽象的
    protected abstract void print();
}
