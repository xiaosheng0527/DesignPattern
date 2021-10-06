package com.atguigu.builder.improve;

/**
 * @author shengxiao
 * @date 2021/9/9 19:50
 */
public class CommonHouse extends HouseBuilder{

    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基5米");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙10m");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子屋顶");
    }
}
