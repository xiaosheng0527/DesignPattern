package com.atguigu.memento.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author shengxiao
 * @date 2021/9/30 13:50
 */

// 守护者对象，保存游戏角色的状态

// Caretaker：负责人
public class Caretaker {

    // 如果只保存一次状态
    private Memento memento ;

    // 对GameRole 保存多次状态 【注意：一个角色可能存在多种状态】
    //private List<Memento> mementos ;

    // 对多个游戏角色保存多个状态 【注意：多个角色可能存在多种状态】
    //private Map<String,List<Memento>> rolesMementos ;

    // 返回 之前保存到 备忘录的 的 Originator【生成者对象】，以备忘录对象的形式返回
    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
