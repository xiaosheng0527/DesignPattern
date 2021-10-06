package com.atguigu.proxy.static_proxy;

/**
 * @author shengxiao
 * @date 2021/9/21 22:57
 */

/**
 * 静态：由程序员创建代理类或特定工具自动生成源代码再对其编译。在程序运行前代理类的.class文件就已经存在了。
 */
public class Client {

    public static void main(String[] args) {
        // 创建目标对象（被代理对象）
        ITeacherDao teacherDao = new TeacherDao() ;

        // 创建代理对象，同时将被代理对象传递给代理对象
        TeacherDaoProxy teacherDaoImplProxy = new TeacherDaoProxy(teacherDao) ;

        // 通过代理对象，调用到被代理对象的方法
        // 即：执行的是代理对象的方法，代理对象再去调用目标对象的方法
        teacherDaoImplProxy.teach();
    }


}
