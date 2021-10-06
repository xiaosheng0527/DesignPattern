package com.atguigu.memento.game;

/**
 * @author shengxiao
 * @date 2021/9/30 13:43
 */

// Memento角色【即备忘录对象】
// 目的：将 Originator角色【即GameRole对象】 整合到一起
public class Memento {

    // 攻击力
    private int vit ;
    // 防御力
    private int def ;

    public Memento(int vit, int def) {
        this.vit = vit;
        this.def = def;
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
