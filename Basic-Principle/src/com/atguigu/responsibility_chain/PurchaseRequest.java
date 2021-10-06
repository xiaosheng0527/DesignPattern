package com.atguigu.responsibility_chain;

/**
 * @author shengxiao
 * @date 2021/10/1 21:12
 */

// 有一个思想：弱化了发出请求的人和处理请求的人之间的关系

// 请求类
// 注意：此类只是 供 请求者【Client】 依赖 【PurchaseRequest】
// 而且 PurchaseRequest类 同时也会被 Handler角色所依赖 【即：委托责任】
public class PurchaseRequest {

    private int type = 0 ;  // 请求类型
    private float price = 0.0f ;    // 对方的答复
    private int id = 0 ;

    // 构造器
    public PurchaseRequest(int type, float price, int id) {
        this.type = type;
        this.price = price;
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
