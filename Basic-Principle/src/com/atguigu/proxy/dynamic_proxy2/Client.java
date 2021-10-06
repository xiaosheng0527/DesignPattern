package com.atguigu.proxy.dynamic_proxy2;

/**
 * @author shengxiao
 * @date 2021/10/4 16:25
 */

/**
 * 动态：在程序运行时运用反射机制动态创建而成。
 */
public class Client {

    public static void main(String[] args){
        LogHandler logHandler=new LogHandler();
        // userManager：代理对象，其已经 存在了 目标类的 方法
        UserManager userManager=(UserManager)logHandler.newProxyInstance(new UserManagerImpl());
        //UserManager userManager=new UserManagerImpl();
        // 代理对象调用 目标类的方法，在底层会触发 LogHandler处理器，调用invoke方法，从而在 核心代码执行的前后 使用 AOP
        userManager.addUser("1111", "张三");
    }
}