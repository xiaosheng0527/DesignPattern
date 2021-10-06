package com.atguigu.adapter.interface_adapter;

/**
 * @author shengxiao
 * @date 2021/9/9 21:43
 */
public class Client {

    public static void main(String[] args) {

        // 注意：虽然抽象类不能创建对象，但匿名内部类可以完成对接口的实现【重写抽象方法】，
        //      以及抽象类的继承【此时需要重写抽象方法】，但这只是一次性的，对外不可访问
        AbsAdapter absAdapter = new AbsAdapter() {

            @Override
            public void m1() {
                super.m1();
                System.out.println("使用了m1的方法");
            }
        } ;

        absAdapter.m1();
    }
}
