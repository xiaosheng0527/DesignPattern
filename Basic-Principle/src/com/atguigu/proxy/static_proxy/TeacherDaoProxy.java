package com.atguigu.proxy.static_proxy;

/**
 * @author shengxiao
 * @date 2021/9/21 22:53
 */

// 代理对象，静态代理
public class TeacherDaoProxy implements ITeacherDao{

    // 被代理对象【目标对象】，通过接口来聚合
    private ITeacherDao target ;

    public TeacherDaoProxy() {
    }

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("代理开始 完成某些操作。。。");   // 方法
        target.teach();
        System.out.println("提交。。。");
        System.out.println("代理结束。。。");  // 方法
    }
}
