package com.atguigu.decorator;

/**
 * @author shengxiao
 * @date 2021/9/14 15:41
 */
public abstract class Drink {

    private String describe ; // 描述
    private float price = 0.0f ;

    public Drink() {
    }

    public Drink(String describe, float price) {
        this.describe = describe;
        this.price = price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    // 获取当前的单价
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    // 计算费用的抽象方法
    // 子类来实现
    // 这里的cost()方法 是计算总费用
    public abstract float cost() ;

}
