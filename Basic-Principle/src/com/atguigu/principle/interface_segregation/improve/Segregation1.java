package com.atguigu.principle.interface_segregation.improve;

/**
 * @author shengxiao
 * @date 2021/9/4 21:01
 */
public class Segregation1 {

    public static void main(String[] args) {
        A a = new A() ;
        a.depend1(new B()); // A类通过接口去依赖B类
        a.depend2(new B()); // A类通过接口去依赖B类
        a.depend3(new B()); // A类通过接口去依赖B类

        C c = new C() ;
        c.depend1(new D()); // C类通过接口去依赖D类
        c.depend4(new D()); // C类通过接口去依赖D类
        c.depend5(new D()); // C类通过接口去依赖D类
    }
}

interface Interface1{
    void operaion1() ;
}

interface Interface2 {
    void operaion2() ;
    void operaion3() ;
}

interface Interface3 {
    void operaion4() ;
    void operaion5() ;
}

class B implements Interface1,Interface2{

    @Override
    public void operaion1() {
        System.out.println("B实现了operation1");
    }

    @Override
    public void operaion2() {
        System.out.println("B实现了operation2");
    }

    @Override
    public void operaion3() {
        System.out.println("B实现了operation3");
    }

}

class D implements Interface1,Interface3{

    @Override
    public void operaion1() {
        System.out.println("D实现了operation1");
    }

    @Override
    public void operaion4() {
        System.out.println("D实现了operation4");
    }

    @Override
    public void operaion5() {
        System.out.println("D实现了operation5");
    }
}

class A{    // A类通过接口Interface1,Interface2 依赖（使用）B类，但是只会用到1,2,3方法
    public void depend1(Interface1 i){
        i.operaion1();
    }

    public void depend2(Interface2 i){
        i.operaion2();
    }

    public void depend3(Interface2 i){
        i.operaion3();
    }
}

class C {    // A类通过接口Interface1,Interface3 依赖（使用）B类，但是只会用到4,5方法

    public void depend1(Interface1 i){
        i.operaion1();
    }

    public void depend4(Interface3 i){
        i.operaion4();
    }

    public void depend5(Interface3 i){
        i.operaion5();
    }
}
