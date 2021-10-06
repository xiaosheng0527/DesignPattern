package com.atguigu.flyweight;

/**
 * @author shengxiao
 * @date 2021/9/21 19:59
 */

// 具体的网站
public class ConcreteWebsite extends Website {

    // 共享的部分，内部状态
    private String type = "" ;  // 网站发布的形式（类型）

    // 构造器
    public ConcreteWebsite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为："+ type + "在使用中。。。使用者是" + user.getName());

    }
}
