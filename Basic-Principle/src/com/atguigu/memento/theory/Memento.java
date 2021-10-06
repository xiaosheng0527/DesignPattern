package com.atguigu.memento.theory;

/**
 * @author shengxiao
 * @date 2021/9/30 13:19
 */
public class Memento {

    private String state ;

    // 构造器
    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
