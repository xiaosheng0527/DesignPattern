package com.atguigu.bridge;

/**
 * @author shengxiao
 * @date 2021/9/10 17:21
 */

// RefinedAbstraction【改善后的抽象化】，在Abstraction角色的基础上增加了新功能角色。
public class UpRightPhone extends Phone {

    // 构造器
    public UpRightPhone(IBrand brand) {
        super(brand);
    }

    public void open(){
        super.open();   // 调用父类的open方法
        System.out.println("直立样式手机");
    }

    public void call(){
        super.call();
        System.out.println("直立样式手机");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("直立样式手机");
    }
}
