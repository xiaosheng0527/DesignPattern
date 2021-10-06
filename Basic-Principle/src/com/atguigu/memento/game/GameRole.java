package com.atguigu.memento.game;

/**
 * @author shengxiao
 * @date 2021/9/30 14:12
 */

// 角色：Originator -> 生成者
// 目的：GameRole会保存自己的最新状态时生成的Memento
//      当把以前的保存的Memento角色传递给Originator角色 时，它会将自己恢复至生成该Memento角色时候的状态
public class GameRole {

    private int vit ;
    private int def ;

    // 创建 Memento ，即根据当前的状态得到Memento
    public Memento createMemento(){
        return new Memento(vit, def) ;

    }

    // 从备忘录对象，恢复GameRole的装填
    public void recoverGameRoleFromMemento(Memento memento){
        this.vit = memento.getVit() ;
        this.def = memento.getDef() ;
    }

    // 显示当前游戏角色的状态
    public void display(){
        System.out.println("游戏角色当前的攻击力：" + this.vit + " 防御力：" + this.def);
    }

    //

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
