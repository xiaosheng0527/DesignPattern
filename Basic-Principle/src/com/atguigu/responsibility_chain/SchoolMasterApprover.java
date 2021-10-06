package com.atguigu.responsibility_chain;

/**
 * @author shengxiao
 * @date 2021/10/1 23:35
 */

// ConcreteHandler【具体的处理者】
// ConcreteHandler 角色是处理请求的具体角色
public class SchoolMasterApprover extends Approver{

    public SchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {

        if(purchaseRequest.getPrice() > 30000) {
            System.out.println("请求编号 id= " + purchaseRequest.getId() + " 被 " + this.name + " 处理");
        } else {
            approver.processRequest(purchaseRequest);
        }
    }
}
