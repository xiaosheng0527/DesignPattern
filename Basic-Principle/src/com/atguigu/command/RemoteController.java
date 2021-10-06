package com.atguigu.command;

/**
 * @author shengxiao
 * @date 2021/9/23 19:58
 */

// 符合OCP原则，对修改关闭，对扩展关闭
public class RemoteController {

    // 开按钮的命令数组
    Command[] onCommands ;
    Command[] offCommands ;

    // 执行撤销命令
    Command undoCommand ;

    // 构造器，完成对按钮的初始化
    public RemoteController(){

        onCommands = new Command[5] ;
        offCommands = new Command[5] ;

        for(int i = 0 ; i < 5 ; i++){
            // 刚开始没有做什么处理，所以是空操作对象
            onCommands[i] = new NoCommand() ;
            offCommands[i] = new NoCommand() ;
        }
    }

    // 给我们的按钮设置你需要的命令
    public void setCommand(int no,Command onCommand,Command offCommand){
        onCommands[no] = onCommand ;
        offCommands[no] = offCommand ;
    }

    // 按下开按钮
    public void onButtonWasPushed(int no){  // no 0
        // 找到你按下的按钮，并调用对应方法
        onCommands[no].execute();
        // 记录这次的操作，用于撤销
        undoCommand = onCommands[no];

    }

    // 按下关按钮
    public void offButtonWasPushed(int no){  // no 0
        offCommands[no].execute();
        // 记录这次的操作，用于撤销
        undoCommand = offCommands[no];

    }

    // 按下撤销按钮
    public void undoButtonWasPushed(){
        undoCommand.undo();
    }

}
