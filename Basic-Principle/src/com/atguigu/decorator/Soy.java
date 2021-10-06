package com.atguigu.decorator;

/**
 * @author shengxiao
 * @date 2021/9/14 16:30
 */
public class Soy extends Decorator{
    public Soy(Drink obj) {
        super(obj);
        setDescribe(" 豆浆 ");
        setPrice(1.5f);
    }
}
