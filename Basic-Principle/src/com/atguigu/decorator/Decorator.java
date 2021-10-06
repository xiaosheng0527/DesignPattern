package com.atguigu.decorator;

/**
 * @author shengxiao
 * @date 2021/9/14 15:51
 */

// 装饰者类，Decorator
public class Decorator extends Drink {

    private Drink obj ; // 被装饰者，即Component

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    //调用父类的方法，super
    // 这里是计算总价格
    @Override
    public float cost() {

        // getPrice 自己价格【即 装饰者 的 价格，这里 用 配料 表示】
        // obj.cost()：之前的 还未更新 新的总价格的 被装饰者【Component】 的 价格
        // 注意：这里可以用super来调用父类的犯法，但是因为继承，此时getPrice也可以直接使用
        // return getPrice() + obj.cost() ;
        // 但是为了看起来使用的正规性，故可以使用super关键字

        // super.getPrice() + obj.cost() 代表更新了 被装饰者的价格 【不论存在多少装饰者】，最终都会以被装饰者来呈现
        return super.getPrice() + obj.cost();

    }

    // 调用父类的方法，super
    public String getDescribe(){

        // 这种写法相当于拼接 Component 和 Decorator
        // obj.getDescribe() 输出的是被装饰者的信息
        // super 相当于调用 父类的 getDescribe() 方法来获取 Decorator 的 装饰者的信息
        // super.getPrice()：获取父类的价格 ，即 获取 Decorator 的 装饰者的信息
        return super.getDescribe() + " " + super.getPrice() + " && " + obj.getDescribe() ;
    }


}
