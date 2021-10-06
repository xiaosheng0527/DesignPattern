package com.atguigu.prototype.improve;

/**
 * @author shengxiao
 * @date 2021/9/8 10:56
 */
public class Sheep implements Cloneable{

    private String name ;
    private int age ;
    private String color ;
    private String address = "蒙古羊" ;
    public Sheep friend ;   // 如果实例属性是对象，则克隆是如何处理的

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Sheep() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    // 重写克隆的方法
    // 克隆该实例，使用默认的clone方法来完成
    @Override
    protected Object clone()  {

        Sheep sheep = null ;
        try {
            sheep = (Sheep) super.clone();  // 调用父类的clone()方法
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return sheep ;
    }
}
