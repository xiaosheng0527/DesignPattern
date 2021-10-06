package com.atguigu.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @author shengxiao
 * @date 2021/9/24 23:11
 */

// 数据结构【但这并不是数据结构Element接口，因为这里只是为了将各个 访问者进行汇聚】，
// 管理很多人（Man,Woman）， 即 负责处理 Element角色【此处是Person下的Man/Woman】 的集合

// 如果你实在会被这个类名所迷惑，你可以 换一个类名，eg：ObjectSet
// 但是 设计模式的书籍里面也是 用到了 ObjectStructure表示 "对象结构" 【并不是数据结构DataStructure】

// 这里只是定义了一个收集 很多人评价结果的类，这里并不是访问者
// 只是为了展示display 结果，但你可以注意一下，display中遍历每一个访问者，
//  而每一个访问者 都会访问 Action【Success/Fail，即数据结构】，从而实现 "操作" 和 "数据结构" 的分离
// 你要清楚，这里 的 操作 Person 和 数据结构 Action 之间 只是 相互 的 依赖，这个会使得耦合性降低。
// 相比以往 数据结构 和 操作 在同一个类中，这已经很好的实现了 分离。

// 综上：ObjectStructure角色 ：能枚举它的元素，可以提供一个高层的接口，用来允许访问者访问的元素
public class ObjectStructure {

    // 维护了一个集合
    private List<Person> persons = new LinkedList<>() ;

    // 增加到list
    public void attach(Person p){
        persons.add(p) ;
    }

    // 移除
    public void detach(Person p){
        persons.remove(p) ;
    }

    // 显示测评情况
    public void display(Action action){
        for(Person p : persons){
            p.accept(action);   // 被访问对象【Element角色】 接受 访问者【Visitor】的访问
        }
    }
}
