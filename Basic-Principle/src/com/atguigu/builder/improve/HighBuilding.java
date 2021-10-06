package com.atguigu.builder.improve;

/**
 * @author shengxiao
 * @date 2021/9/9 19:52
 */
public class HighBuilding extends HouseBuilder{


    @Override
    public void buildBasic() {
        System.out.println("高楼的地基100米");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼的砌墙20米");
    }

    @Override
    public void roofed() {
        System.out.println("高楼的透明的屋顶");
    }
}
