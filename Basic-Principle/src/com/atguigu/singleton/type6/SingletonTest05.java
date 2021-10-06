package com.atguigu.singleton.type6;

/**
 * @author shengxiao
 * @date 2021/9/5 16:06
 */
public class SingletonTest05 {

    public static void main(String[] args) {
        // 测试
        System.out.println("双重检查");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);  // true
        System.out.println("instance.hashCode()=" + instance.hashCode());  // true
        System.out.println("instance2.hashCode()=" + instance2.hashCode());  // true
    }
}

class Singleton {

    /**
     * 对于可见性，Java提供了volatile关键字来保证可见性。
     *
     * 　　当一个共享变量【引用数据类型】被volatile修饰时，它会保证修改的值会立即被更新到主存，当有其他线程需要读取时，它会去内存中读取新值。
     *
     * 　　而普通的共享变量【类似基本数据类型】不能保证可见性，因为普通共享变量被修改之后，什么时候被写入主存是不确定的，当其他线程去读取时，此时内存中可能还是原来的旧值，因此无法保证可见性。
     *
     * 　　另外，通过synchronized和Lock也能够保证可见性，synchronized和Lock能保证同一时刻只有一个线程获取锁然后执行同步代码，并且在释放锁之前会将对变量的修改刷新到主存当中。因此可以保证可见性。
     *
     *    重点： "对于 java中voliate的讲解 具体可以看CSDN-> 收藏夹 -> 设计模式 -> java中voliate的讲解"
     *
     *
     *    关于 对象锁和类锁的 区分？？？
     *
     *      使用对象锁的情况，只有使用同一实例的线程才会受锁的影响，多个实例调用同一方法也不会受影响。
     *
     *      类锁是所有线程共享的锁，所以同一时刻，只能有一个线程使用加了锁的方法或方法体，不管是不是同一个实例
     */
    private static volatile Singleton instance ;

    private Singleton (){

    }

    // 提供一个静态的公有方法，加入双重检查代码，解决线程安全问题，同时解决懒汉式加载问题
    // 即懒汉式 (线程安全)  推荐使用
    public static Singleton getInstance (){
        // eg：如果此时有两个线程同时进入if语句，那么先抢到的进程先执行，此时查看对象还未创建，则先创建，
        // 之后结束后释放锁，之后的进程再执行，但发现对象已经创建好，此时就无需再次创建了，就直接返回。
        if(instance == null){
            // 类锁是所有线程共享的锁，所以同一时刻，只能有一个线程使用加了锁的方法或方法体，不管是不是同一个实例
            synchronized (Singleton.class){ // synchronized作用的域为 Singleton.class,即Singleton对象
                if(instance == null){
                    instance = new Singleton() ;
                }
            }
        }
        return instance ;
    }
}
