package com.atguigu.responsibility_chain;

/**
 * @author shengxiao
 * @date 2021/10/1 21:20
 */

// Handler【处理者】角色
// Handler角色定义了处理请求的接口。Handler角色知道 "下一个处理者"是谁，
// 如果自己无法处理请求，它会将请求 转给 “下一个处理者”。
// 当然 "下一个处理者" 也是Handler角色。
public abstract class Approver {

    Approver approver ;
    String name ;   // 名字

    // 抽象类的带参数构造方法，子类必须要进行调用，因为 你要记得创建对象的时候，是通过递归来创建对象，即通过super关键字来实现
    // 抽象类中,有构造方法,但是不能new,那么构造方法干嘛的呢? 给子类用的!!!
    // 子类可以根据父类的 字段进行初始化父类，然后再 初始化 本身
    // 但因为 这里的 父类 是 抽象类 ，所以 这里只是 初始化 父类【抽象类】 的 字段，但未创建出对象
    public Approver(String name) {
        this.name = name;
    }

    // 下一个处理者
    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    // 处理审批请求的方法，得到一个请求，处理是子类完成，因此该方法做成抽象
    public abstract void processRequest(PurchaseRequest purchaseRequest) ;
}
