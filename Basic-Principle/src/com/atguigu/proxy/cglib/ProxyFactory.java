package com.atguigu.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author shengxiao
 * @date 2021/9/22 15:38
 */

// 需要引入 cglib的jar包，才能使用下面的类以及对应的方法
// 通过cglib代理，实现 对 目标对象 的 子类 进行 动态代理

// ProxyFactory：本身是代理工厂，通过执行相应的方法生成代理对象
public class ProxyFactory implements MethodInterceptor {

    // 维护一个目标对象
    private Object target ;

    // 构造器，传入一个被代理对象

    public ProxyFactory(Object target) {
        this.target = target;
    }

    // 返回一个代理对象，是 target 对象 的 代理对象
    public Object getProxyInstance() {

        // 1. 创建一个工具类
        Enhancer enhancer = new Enhancer() ;
        // 2. 设置父类 【将 被代理类 作为父类】
        enhancer.setSuperclass(target.getClass());
        // 3. 设置回调函数
        enhancer.setCallback(this);
        // 4. 创建子类对象，即代理对象
        return enhancer.create() ;

    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("cglib代理模式~~开始");
        Object returnVal = method.invoke(target, objects) ;    // objects代表参数
        System.out.println("cglib代理模式~~提交");
        return returnVal ;

    }
}
