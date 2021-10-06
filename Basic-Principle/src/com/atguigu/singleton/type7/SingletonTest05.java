package com.atguigu.singleton.type7;

/**
 * @author shengxiao
 * @date 2021/9/5 16:06
 */
public class SingletonTest05 {

    public static void main(String[] args) {
        // 测试
        System.out.println("使用静态内部类完成单例模式");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);  // true
        System.out.println("instance.hashCode()=" + instance.hashCode());  // true
        System.out.println("instance2.hashCode()=" + instance2.hashCode());  // true
    }
}

// 静态内部类完成单例模式 , 推荐使用
class Singleton {

    // 构造器私有化
    private Singleton (){

    }

    /**
     * 静态内部类的优点是：外部类加载时并不需要立即加载内部类，内部类不被加载则不去初始化INSTANCE，故而不占内存。
     * 即当SingleTon第一次被加载时，并不需要去加载 SingletonInstance，只有当getInstance()方法第一次被调用时，
     * 才会去初始化 SingletonInstance,第一次调用getInstance()方法会导致虚拟机加载 SingletonInstance类，
     * 而在类进行初始化 静态属性 的时候，别的线程是无法进入的，故保证线程安全
     * 这种方法不仅能确保线程安全，也能保证单例的唯一性，同时也延迟了单例的实例化。
     */

    // 写一个静态内部类，该类中有一个静态属性 Singleton
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton() ;
    }

    // 提供一个静态的公有方法，直接返回SingletonInstance.INSTANCE
    public static Singleton getInstance (){

        return SingletonInstance.INSTANCE ;
    }
}
