package com.atguigu.decorator;

/**
 * @author shengxiao
 * @date 2021/9/14 15:45
 */

// 注意：这里的Coffee 把 所有的 咖啡品种 抽象出一层缓冲层
public class Coffee extends Drink{


    @Override
    public float cost() {
        return super.getPrice() ;   // 有时候可以直接使用父类的方法就行
    }


}
