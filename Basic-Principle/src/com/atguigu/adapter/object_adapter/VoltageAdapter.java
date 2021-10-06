package com.atguigu.adapter.object_adapter;

/**
 * @author shengxiao
 * @date 2021/9/9 20:59
 */

// 适配器类
public class VoltageAdapter implements IVoltage5V {

    private Voltage220V voltage220V ;

    // 通过构造器，传入一个Voltage220V 实例
    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V; // 关联关系-聚合
    }

    @Override
    public int output5V() {

        int dest = 0 ;
        if(null != voltage220V) {
            int src = voltage220V.output220V(); // 获取220V的电话
            System.out.println("使用对象适配器，进行适配~~");
            dest = src / 4 ;
            System.out.println("适配完成，输出的电压为=" + dest);
        }

        return dest ;
    }
}
