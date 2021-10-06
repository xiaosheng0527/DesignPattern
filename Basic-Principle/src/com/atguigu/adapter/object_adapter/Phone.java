package com.atguigu.adapter.object_adapter;

/**
 * @author shengxiao
 * @date 2021/9/9 21:03
 */
public class Phone {

    // 充电
    // 这里的IVoltage5V是接口，起到桥梁的作用，将转接【适配器】进行抽象，具体实现是通过适配器来进行逻辑判断
    public void charging(IVoltage5V iVoltage5V){
        if(iVoltage5V.output5V() == 5){
            System.out.println("电压为5V，可以充电");
        } else if(iVoltage5V.output5V() > 5){
            System.out.println("电压大于5V，过高");
        }
    }
}
