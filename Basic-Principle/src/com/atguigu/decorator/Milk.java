package com.atguigu.decorator;

/**
 * @author shengxiao
 * @date 2021/9/14 16:29
 */
public class Milk extends Decorator {

    public Milk(Drink obj) {
        super(obj);
        // 将 装饰者的 价格保存在 Drink的现有的字段中
        // 为什么要这样做？？
        // 因为 装饰者【Decorator】 是 为 被装饰者【Component】 来 服务
        setDescribe(" 牛奶 ");
        setPrice(2.0f);
    }
}
