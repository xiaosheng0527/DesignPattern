package com.atguigu.command;

/**
 * @author shengxiao
 * @date 2021/9/23 19:34
 */

// 将一个接受者对象与一个动作绑定，调用接收者相应的操作，实现execute
public class LightOnCommand implements Command {

    // 聚合LightReceiver
    LightReceiver light ;

    // 构造器
    public LightOnCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        // 调用接收者的方法
        light.on();
    }

    @Override
    public void undo() {
        // 调用接收者的方法
        light.off();
    }
}
