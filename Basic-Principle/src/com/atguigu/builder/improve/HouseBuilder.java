package com.atguigu.builder.improve;

/**
 * @author shengxiao
 * @date 2021/9/9 19:45
 */

// 抽象的建造者
public abstract class HouseBuilder {

    protected House house = new House() ;

    // 将建造的流程写好，抽象的方法
    // 打地基
    public abstract void buildBasic() ;
    // 砌墙
    public abstract void buildWalls() ;
    // 封顶
    public abstract void roofed() ;

    // 建造房子后，将产品（房子）返回
    // 这里具体的逻辑【怎么建造，做了什么事，都留给上层，此方法的执行的结果就是得到了一个建造好的房子】
    public House buildHouse() {
        return house ;
    }

}
