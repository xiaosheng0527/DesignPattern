package com.atguigu.principle.interface_segregation;

/**
 * @author shengxiao
 * @date 2021/9/4 21:01
 */
public class Segregation1 {

    public static void main(String[] args) {

    }
}

interface Interface1{
    void operaion1() ;
    void operaion2() ;
    void operaion3() ;
    void operaion4() ;
    void operaion5() ;
}

class B implements Interface1{

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

    @Override
    public void operaion4() {
        System.out.println("B实现了operation4");
    }

    @Override
    public void operaion5() {
        System.out.println("B实现了operation5");
    }
}

class D implements Interface1{

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

    @Override
    public void operaion4() {
        System.out.println("B实现了operation4");
    }

    @Override
    public void operaion5() {
        System.out.println("B实现了operation5");
    }
}

class A{    // A类通过接口Interface1 依赖（使用）B类，但是只会用到1,2,3方法
    public void depend1(Interface1 i){
        i.operaion1();
    }

    public void depend2(Interface1 i){
        i.operaion2();
    }

    public void depend3(Interface1 i){
        i.operaion3();
    }
}

class C {    // A类通过接口Interface1 依赖（使用）B类，但是只会用到4,5方法

    public void depend1(Interface1 i){
        i.operaion1();
    }

    public void depend4(Interface1 i){
        i.operaion4();
    }

    public void depend5(Interface1 i){
        i.operaion5();
    }
}
