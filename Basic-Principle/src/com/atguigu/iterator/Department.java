package com.atguigu.iterator;

/**
 * @author shengxiao
 * @date 2021/9/28 15:59
 */
// 系
public class Department {

    private String name ;
    private String desc ;   // 描述信息

    public Department(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
