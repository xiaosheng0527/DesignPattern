package com.atguigu.proxy.cglib2;

/**
 * @author shengxiao
 * @date 2021/10/4 17:22
 */

// 实现一个业务类，注意，这个业务类并没有实现任何接口
public class HelloService {

    public HelloService() {
        System.out.println("HelloService构造");
    }

    /**
     * 该方法不能被子类覆盖,Cglib是无法代理final修饰的方法的
     */
    final public String sayOthers(String name) {
        System.out.println("HelloService:sayOthers>>"+name);
        return null;
    }

    public void sayHello() {
        System.out.println("HelloService:sayHello");
    }
}
