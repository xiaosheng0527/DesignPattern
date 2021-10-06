package com.atguigu.adapter.object_adapter;

/**
 * @author shengxiao
 * @date 2021/9/9 20:57
 */

// 被适配的类
public class Voltage220V {

    // 输出 220V 的电压，不变
    public int output220V(){
        int srcV = 220 ;
        System.out.println("电压=" + srcV + "伏") ;
        return srcV ;
    }
}
