package com.atguigu.proxy.cglib2;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author shengxiao
 * @date 2021/10/4 17:26
 */
/**
 * 自定义MethodInterceptor
 */
public class MyMethodInterceptor implements MethodInterceptor {

    /**
     * sub：cglib生成的代理对象 ,即表示增强的对象【即：代理对象】
     * method：被代理对象方法，即表示 要被拦截的方法
     * objects：方法入参，即表示 要被拦截方法的参数
     * methodProxy: 代理方法，即表示 要触发父类的方法对象
     */
    @Override
    public Object intercept(Object sub, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("======插入前置通知======");
        // 这里调用的规则和jdk动态代理不同，jdk动态代理传入的是目标对象，而这里传入的是 代理对象
        // 而且我看了 cglib1包下的 这里 执行 核心代码 的 代码逻辑，其也是 遵循 jdk动态代理点写法
        // 所以，说明，这并不是关键的原因，其实具体的区别我也不懂。你可以看看CSDN我的收藏夹，里面对于这方面的介绍。
        // 综上：如果你实在不会，就可以 还是 按照 jdk 的核心方法来写，这时你可以参照 cglib1包里面的逻辑
        Object object = methodProxy.invokeSuper(sub, objects);
        System.out.println("======插入后者通知======");
        return object;
    }

}
