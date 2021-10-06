package com.atguigu.proxy.dynamic_proxy1;

/**
 * @author shengxiao
 * @date 2021/9/21 23:32
 */

/**
 * 动态：在程序运行时运用反射机制动态创建而成。
 */
public class Client {

    public static void main(String[] args) {

        // 创建目标对象
        ITeacherDao target= new TeacherDao() ;

        // 给目标对象，创造代理对象
        // 由代理对象生成，目标类的实例
        // 是由 代理对象包装过的，所以在 Client调用 代理对象 的方法时候，就会 触发 InvocationHandler的实例，从而调用invoke()方法

        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();

        // proxyInstance=class com.sun.proxy.$Proxy0 内存中 动态生成了 代理对象
        System.out.println("proxyInstance=" + proxyInstance.getClass());

        proxyInstance.teach();

        // 这个是用代理对象调用另一个方法sayHello
        // 代理对象调用 目标类的方法，在底层会触发 实现了InvocationHandler接口的实例【匿名内部类】的处理器，
        // 调用invoke方法，从而在 核心代码执行的前后 使用 AOP
        proxyInstance.sayHello(" tom ");
    }
}
