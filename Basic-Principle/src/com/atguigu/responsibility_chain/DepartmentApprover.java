package com.atguigu.responsibility_chain;

/**
 * @author shengxiao
 * @date 2021/10/1 21:24
 */

// ConcreteHandler【具体的处理者】
// ConcreteHandler 角色是处理请求的具体角色
public class DepartmentApprover extends Approver{

    // 注意：父类是抽象类，所以不会创建出父类对象，但是 父类作为抽象类 会给子类 提供 字段
    // 即 会将字段 继承给 子类，所以这里 其实 这里的字段 都是 为 子类服务的
    public DepartmentApprover(String name) {
        super(name);    // 为父类【抽象类】的name字段进行初始化【调用父类的构造方法】，但实际上的父类 并未创建出对象，
                        // 只是将父类 初始化的变量 给 子类 来使用
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {

        if(purchaseRequest.getPrice() <= 5000) {
            System.out.println("请求编号 id= " + purchaseRequest.getId() + " 被 " + this.name + " 处理");
        } else {
            approver.processRequest(purchaseRequest);
        }


    }
}
