package com.atguigu.proxy.dynamic_proxy1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author shengxiao
 * @date 2021/9/21 23:17
 */

// ProxyFactory：本身是代理工厂，通过执行相应的方法生成代理对象
public class ProxyFactory {

    // 维护一个目标对象，Object
    private Object target ;

    // 构造器，对target 进行初始化
    public ProxyFactory(Object target) {
        this.target = target;
    }

    // 给目标对象生成一个代理对象
    public Object getProxyInstance(){

        /**
         *
* 		/*
* 		 *  public static Object newProxyInstance(ClassLoader loader,
*                                           Class<?>[] interfaces,
*                                           InvocationHandler h)
         *
*             //1. ClassLoader loader ： 指定当前目标对象使用的类加载器, 获取加载器的方法固定
*             //2. Class<?>[] interfaces: 目标对象实现的接口类型，使用泛型方法确认类型
*             //3. InvocationHandler h : 事情处理，执行目标对象的方法时，会触发事情处理器方法, 会把当前执行的目标对象方法作为参数传入
         *
         */

        // 由代理对象 生成 目标类的实例 【但这 并不是 真正的TeacherDao类的实例，而是代理而来的】
        // 虽然它还是 目标类的实例，但 这已经是由 代理对象包装过的，所以在 Client调用 目标类的方法时候，就会 进入到 代理类的 invoke()方法，
        // 这只是调用 代理对象的invoke()方法，而不是 目标类的方法，目标类的方法需要在 invoke()方法 的 内部。
        // 此时就可以在 调用前，后来编写相应的标记代码
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    // 相当于是 代理类的方法，这并不是 目标类的方法
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("JDK代理开始");

                        // ----------------------------------------------------
                        // 在下面 method.invoke()方法调用之前，可以进行 输出 某些 提示信息，用于对事务 的 相关记录

                        // 代理类调用目标对象的方法，即相当于底层调用 TeacherDao类【被代理类】的 内部的invoke()方法，但是需要确定参数类型
                        // 实际上，还有一层 InvocationHandler 封装 外部的 invoke()方法，用于 确定 事务AOP 发生前 要做什么事，发生后需要做什么事，
                        // 相当于 @Before，@After，即spring中关于 事务AOP 面向切面编程的介绍
                        // 而外部invoke()方法的内部的invoke()方法就代表实际上调用业务逻辑方法
                        // 这里区分不同的方法，就是通过调用方法过程中，携带参数的 不同 ，存放在 args 数组中
                        Object returnVal = method.invoke(target, args) ;    // 这里的returnVal变量是为了接收有返回值方法的信息，若是void方法，则默认为null

                        // 在上面 method.invoke()方法调用之后，可以进行 输出 某些 提示信息，用于对事务 的 相关记录
                        // ----------------------------------------------------

                        System.out.println("JDK代理提交");
                        return returnVal ;
                    }
                }) ;
    }
}
