package com.atguigu.principle.dependence_inversion.improve;

/**
 * @author shengxiao
 * @date 2021/9/4 21:45
 */
public class DependencyInversion {

    public static void main(String[] args) {

        // 客户端无需改变
        Person person = new Person() ;
        person.receive(new Email());

        person.receive(new WeiXin());
    }
}

// 定义接口
interface IReceiver {
    public String getInfo() ;
}

class Email implements IReceiver {
    public String getInfo() {
        return "电子邮件信息:hello,world" ;
    }
}

class WeiXin implements IReceiver {
    public String getInfo() {
        return "微信信息:hello,weixin" ;
    }
}

// 方式2
class Person {
    // 这里我们是对接口的依赖
    public void receive(IReceiver receiver){
        System.out.println(receiver.getInfo());
    }
}
