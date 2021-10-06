package com.atguigu.principle.liskov_substitution.improve;

/**
 * @author shengxiao
 * @date 2021/9/5 8:54
 */
public class Liskov {

    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3=" + a.func1(11, 3));
        System.out.println("1-8=" + a.func1(1, 8));

        System.out.println("-----------------------");
        B b = new B();

        // 因为B类不在继承A类，因此调用者，不会再认为func1是求减法
        System.out.println("11+3=" + b.func1(11, 3));
        System.out.println("1+8=" + b.func1(1, 8));
        System.out.println("11+3+9=" + b.func2(11, 3));

        // 使用组合任然可以使用到A类相关方法
        System.out.println("11-3=" + b.func3(11, 3));

    }
}

// 创建一个更加基础的基类
class Base {
    // 把更基础的方法和成员写到Base类
}

// A类
class A extends Base {
    // 返回两个数的差
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

// B类继承了A
// 增加了一个新功能：完成两个数相加,然后和9求和
class B extends Base {
    private A a = new A() ;

    // 如果B类想使用到A类的方法，使用组合关系
    // 这里，重写了A类的方法，可能是无意识

    //这里，重写了A类的方法, 可能是无意识
    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }

    // 我们仍然想使用A的方法
    public int func3(int a,int b){
        return this.a.func1(a, b) ;
    }
}
