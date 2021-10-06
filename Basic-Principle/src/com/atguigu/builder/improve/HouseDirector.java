package com.atguigu.builder.improve;

/**
 * @author shengxiao
 * @date 2021/9/9 19:53
 */

// 指挥者，这里会指定制作流程，返回具体产品
public class HouseDirector {

    HouseBuilder houseBuilder = null ;

    // 构造器传入 houseBuilder

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public HouseDirector() {
    }

    // 通过setter 传入 houseBuilder

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    // 如何处理建造房子的流程，交给指挥者
    public  House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse() ;  // 返回建造的结果
    }
}
