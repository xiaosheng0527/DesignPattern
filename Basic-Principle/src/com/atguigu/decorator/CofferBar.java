package com.atguigu.decorator;

/**
 * @author shengxiao
 * @date 2021/9/14 16:31
 */
public class CofferBar {

    public static void main(String[] args) {

        // 装饰者模式下的订单：2份巧克力 + 1份牛奶的LongBlack

        // 注意：这里的配料是一层层的添加，即套娃，类似递归，所以 实际上都是操作的是同一个对象
        // 只是我们一直在切换 被装饰者【Component】 和 装饰者 【Decorator】 的 角色，因为层次的改变
        // 例如：如果原来是 当前层的 装饰者 【Decorator】，下一层 就 又变成了 被装饰者【Component】

        // 1. 点一份 LongBlack
        Drink order = new LongBlack() ; // 构造方法里面有给 LongBlack赋初值
        System.out.println("费用1=" + order.cost());  // 多态，运行时动态确定其数据类型
        System.out.println("描述=" + order.getDescribe());

        // 2. 加入一份牛奶
        // 这里 order 是 被装饰者【Component,即这里是配料】，得到的order是新的对象
        // 牛奶是配料，即 Decorator装饰者，这是是将 被装饰者【Component】 放进 装饰者【Decorator】(相当于盒子)
        // 相当于套娃
        // order 始终是 Drink类型，即 Component 被装饰者
        order = new Milk(order) ;

        System.out.println("order 加入一份牛奶  费用 = " + order.cost());
        System.out.println("order 加入一份牛奶  描述 = " + order.getDescribe());

        // 3. order 加入一份 巧克力
        order = new Chocolate(order) ;

        System.out.println("order 加入一份巧克力  费用 = " + order.cost());
        System.out.println("order 加入一份巧克力  描述 = " + order.getDescribe());



        // 你可以看到，我们不论添加哪个配料，都只需要进行一层层的包装【即装饰】，而不用去编写其他方法
        // 而且如果此时扩展，要买的咖啡的配料不同，也可以很容易的得到

        // eg
        System.out.println("==================================");

        Drink order2 = new Decaf() ; // 被装饰者

        System.out.println("order2 无因咖啡  费用 = " + order2.cost());
        System.out.println("order2 无因咖啡  描述 = " + order2.getDescribe());

        order2 = new Milk(order2) ;

        System.out.println("order2 无因咖啡  费用 = " + order2.cost());
        System.out.println("order2 无因咖啡  描述 = " + order2.getDescribe());
    }
}
