package com.atguigu.singleton.type04;

/**
 * @author shengxiao
 * @date 2021/9/5 16:06
 */
public class SingletonTest04 {

    public static void main(String[] args) {
        // 测试
        System.out.println("懒汉式2，线程安全");
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

    // 提供一个静态的公有方法，加入同步处理的代码，解决了线程安全问题
    // 即懒汉式 (线程安全) 但是不推荐使用，效率太低
    public static synchronized Singleton getInstance (){
        // 此if语句为防止多次调用该方法时，重复创建对象
        if(instance == null){
            instance = new Singleton() ;
        }
        return instance ;
    }
}
