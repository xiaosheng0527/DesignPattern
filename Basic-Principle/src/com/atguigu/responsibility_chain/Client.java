package com.atguigu.responsibility_chain;

/**
 * @author shengxiao
 * @date 2021/10/1 23:40
 */

// Client角色 【请求者】
// Client角色是向第一个ConcreteHandler角色发送请求的角色
public class Client {

    public static void main(String[] args) {

        // 创建一个请求
        PurchaseRequest purchaseRequest = new PurchaseRequest(1, 31000, 1) ;

        // 创建相关的审批人
        Approver departmentApprover = new DepartmentApprover("张主任") ;
        Approver collegeApprover = new CollegeApprover("李院长") ;
        Approver viceSchoolMasterApprover = new ViceSchoolMasterApprover("王副校长") ;
        Approver schoolMasterApprover = new SchoolMasterApprover("佟校长") ;

        // 需要将各个审批级别的下一个设置好（处理人构成环形,这样就可能会比较快速的定位到）
        // 但是如果不构成环形，则也可以构成 单向链表，具体还是要看项目的需求，但你要切记 单向链表 不宜过长。
        departmentApprover.setApprover(collegeApprover) ;
        collegeApprover.setApprover(viceSchoolMasterApprover);
        viceSchoolMasterApprover.setApprover(schoolMasterApprover);
        schoolMasterApprover.setApprover(departmentApprover) ;

        departmentApprover.processRequest(purchaseRequest);
        viceSchoolMasterApprover.processRequest(purchaseRequest);

    }
}