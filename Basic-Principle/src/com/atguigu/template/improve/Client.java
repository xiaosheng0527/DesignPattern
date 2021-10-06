package com.atguigu.template.improve;

/**
 * @author shengxiao
 * @date 2021/9/22 19:15
 */

/**
 * 模板方法模式的钩子方法
 * 1) 在模板方法模式的父类中，我们可以定义一个方法，它默认不做任何事，子类可以
 * 视情况要不要覆盖它，该方法称为“钩子”。
 * 2) 还是用上面做豆浆的例子来讲解，比如，我们还希望制作纯豆浆，不添加任何的配
 * 料，请使用钩子方法对前面的模板方法进行改造
 */
public class Client {

    public static void main(String[] args) {

        // 制作红豆豆浆

        System.out.println("----制作红豆豆浆-----");
        SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk() ;
        // 注意：这里make()方法是final的，故 不会在 后期 动态绑定到具体的对象上，
        redBeanSoyaMilk.make();

        System.out.println("----制作花生豆浆-----");
        SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk() ;
        // 注意：这里make()方法是final的，故 不会在 后期 动态绑定到具体的对象上，
        peanutSoyaMilk.make();

        System.out.println("----制作纯豆浆-----");
        SoyaMilk pureSoyaMilk = new PureSoyaMilk() ;
        // 注意：这里make()方法是final的，故 不会在 后期 动态绑定到具体的对象上，
        pureSoyaMilk.make();
    }
}
