package com.atguigu.singleton.type3;

/**
 * @author shengxiao
 * @date 2021/9/5 16:06
 */
public class SingletonTest03 {

    public static void main(String[] args) {
        // 测试
        System.out.println("懒汉式1，线程不安全");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);  // true
        System.out.println("instance.hashCode()=" + instance.hashCode());  // true
        System.out.println("instance2.hashCode()=" + instance2.hashCode());  // true
    }
}

class Singleton {
    private static Singleton instance ;

    private Singleton (){

    }

    // 提供一个静态的公有方法，当使用到该方法时，才会去创建instance
    // 即懒汉式 (线程不安全)
    public static Singleton getInstance (){
        // 此if语句为防止多次调用该方法时，重复创建对象
        if(instance == null){
            instance = new Singleton() ;
        }
        return instance ;
    }
}
