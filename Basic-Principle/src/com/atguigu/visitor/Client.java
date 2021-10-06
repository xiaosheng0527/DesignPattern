package com.atguigu.visitor;

/**
 * @author shengxiao
 * @date 2021/9/24 23:14
 */
public class Client {

    public static void main(String[] args) {

        // 创建ObjectStructure
        ObjectStructure objectStructure = new ObjectStructure() ;

        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());
        objectStructure.attach(new Man());

        // 成功 - 具体的访问者
        Action success = new Success() ;
        objectStructure.display(success);

        System.out.println("=======================");
        // 失败  -  具体的 访问者
        Action fail = new Fail() ;
        objectStructure.display(fail);

        System.out.println("===========给的是待定的测评=============");

        // 扩展性强，即可以直接在 Action下进行扩展类，而其他地方无需修改代码
        // 注意：这里 扩展 Action表示数据结构的抽象类，即Element类【操作】比较方便，符合OCP原则，
        // 而如果是对访问者Person进行扩展，好像也很方便，不用修改什么代码，也符合OCP原则
        Action wait = new Wait();
        objectStructure.display(wait);
    }
}
