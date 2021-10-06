package com.atguigu.command;

/**
 * @author shengxiao
 * @date 2021/9/23 19:30
 */

// 创建命令接口
public interface Command {

    // 执行动作（操作）
    public void execute() ;
    // 撤销动作（操作）
    public void undo() ;
}
