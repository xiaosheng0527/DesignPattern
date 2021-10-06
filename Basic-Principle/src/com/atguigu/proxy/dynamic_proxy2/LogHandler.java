package com.atguigu.proxy.dynamic_proxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author shengxiao
 * @date 2021/10/4 16:14
 */
//动态代理类只能代理接口（不支持抽象类），代理类都需要实现InvocationHandler类，实现invoke方法。
// 该invoke方法就是调用被代理接口的所有方法时需要调用的，该invoke方法返回的值是被代理接口的一个实现类

// 注意：和 dynamic_proxy1包下的代理对象的区别，就是这里的类实现了 InvocationHandler 接口，而 dynamic_proxy1包的 代理工厂没有明写实现了这个接口。
//      但你应该能发现，这两者其实 表达的意思是一样的，你要明确 newProxyInstance()方法的第三个参数 是 实现了 InvocationHandler的 处理器

// 切记：生成的代理对象 只是 拥有 与 委托对象【目标对象】相同的 性质，即实现了 接口，属于同一个类加载，
// 但是 在 Client 调用 目标对象的方法的时候，其实 这里使用的是 代理对象 的 方法，即【看起来 好像 是 目标对象的实例自己调用 自己的方法，殊不知底层是通过代理对象来实现的】

// 具体流程：
// 在Client要把具体的委托对象【目标对象】 传入，然后生成(关于委托类)的代理对象(将其包装到实现了InvocationHandler接口的实现类)，
// 从而在以后调用 目标对象 的方法的时候 会触发这个处理器，然后调用相应的invoke方法，然后 在逻辑代码执行的前后 进行处理 一些 非逻辑操作【AOP】，此时相当于 符合了 OCP原则

// 综上：我们会发现其实动态代理只是对类做了进一步抽象和封装，使其复用性和易用性得到进一步提升而这不仅仅符合了面向对象的设计理念，
//      其中还有AOP的身影，这也提供给我们对类抽象的一种参考。关于动态代理与AOP的关系，个人觉得AOP是一种思想，而动态代理是一种AOP思想的实现！
public class LogHandler implements InvocationHandler {

    // 目标对象
    private Object targetObject;
    //绑定关系，也就是关联到哪个接口（与具体的实现类绑定）的哪些方法将被调用时，执行invoke方法。
    public Object newProxyInstance(Object targetObject){
        this.targetObject=targetObject;
        //该方法用于为指定类装载器、一组接口及调用处理器生成动态代理类实例
        //第一个参数指定产生代理对象的类加载器，需要将其指定为和目标对象同一个类加载器
        //第二个参数要实现和目标对象一样的接口，所以只需要拿到目标对象的实现接口
        //第三个参数表明这些被拦截的方法在被拦截时需要执行哪个InvocationHandler的invoke方法
        //根据传入的目标返回一个代理对象
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),
                targetObject.getClass().getInterfaces(),this);
    }
    @Override
    //关联的这个实现类的方法被调用时将被执行
    /*InvocationHandler接口的方法，proxy表示代理，method表示原对象被调用的方法，args表示方法的参数*/
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        System.out.println("start-->>");
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
        Object ret=null;
        try{
            /*原对象方法调用前处理日志信息*/
            System.out.println("satrt-->>");

            //调用目标方法
            ret=method.invoke(targetObject, args);
            /*原对象方法调用后处理日志信息*/
            System.out.println("success-->>");
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("error-->>");
            throw e;
        }
        return ret;
    }

}
