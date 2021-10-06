package com.atguigu.memento.game;

/**
 * @author shengxiao
 * @date 2021/9/30 14:17
 */
public class Client {

    public static void main(String[] args) {

        // 创建游戏角色
        GameRole gameRole = new GameRole();
        gameRole.setVit(100);
        gameRole.setDef(100);

        System.out.println("和boss大战前的状态");
        gameRole.display();

        // 把当前状态保存 caretaker
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(gameRole.createMemento());

        System.out.println("和boss大战~~");
        gameRole.setDef(30);
        gameRole.setVit(30);

        gameRole.display();

        System.out.println("大战后，使用备忘录对象恢复到 原始状态");
        // 即：gameRole对象【Originator角色】：使用接收到的Memento角色【在守护者对象Caretaker中保存】来恢复自己的状态
        gameRole.recoverGameRoleFromMemento(caretaker.getMemento());
        System.out.println("恢复后的状态");
        gameRole.display();
    }
}
