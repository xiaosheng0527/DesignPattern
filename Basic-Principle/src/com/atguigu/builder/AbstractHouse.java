package com.atguigu.builder;

/**
 * @author shengxiao
 * @date 2021/9/9 19:26
 */
public abstract class AbstractHouse {

    // 打地基
    public abstract void buildBasic() ;
    // 砌墙
    public abstract void buildWalls() ;
    // 封顶
    public abstract void roofed() ;

    // 实例方法，即 行为
    public void build(){
        buildBasic();
        buildWalls();
        roofed();
    }


}
