package com.atguigu.decorator;

/**
 * @author shengxiao
 * @date 2021/9/14 16:28
 */
public class Chocolate extends Decorator{

    public Chocolate(Drink obj) {
        super(obj);
        setDescribe(" 巧克力 ");
        setPrice(3.0f); // 调味品 的价格
    }
}
