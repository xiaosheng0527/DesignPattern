package com.atguigu.singleton.type2;

/**
 * @author shengxiao
 * @date 2021/9/5 15:40
 */
public class SingletonTest02 {

    public static void main(String[] args) {

        // 测试
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);  // true
        System.out.println("instance.hashCode()=" + instance.hashCode());  // true
        System.out.println("instance2.hashCode()=" + instance2.hashCode());  // true
    }
}

// 饿汉式（静态代码块）  这种单例模式可用，但是可能造成内存浪费

class Singleton {
    // 1.构造器私有化，防止外部类进行new,故需要通过外部调用静态方法来创建Singleton对象
    // 构造方法使用了private声明，那么就表示这个构造方法只能被这个类的内部所使用。
    // 既然如此，那么就可以在这个类的内部实例化对象。而无法在类的外部直接调用构造方法来初始化对象
    private Singleton (){

    }

    // 2. 本类内部创建对象实例
    // 在类加载的过程中，静态变量，静态类，会在方法区 内存进行初始化
    // 注意：此实例变量无法被继承，因为被final修饰，而且因为有private，则除本类外都无法使用访问，除非使用外部的公有方法
    private static Singleton instance ;

    static {    // 在静态代码块中，创建单例对象
        instance = new Singleton() ;
    }

    // 3. 提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance(){
        return instance ;
    }
}
