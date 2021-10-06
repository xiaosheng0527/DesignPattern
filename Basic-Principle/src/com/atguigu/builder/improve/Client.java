package com.atguigu.builder.improve;

/**
 * @author shengxiao
 * @date 2021/9/9 19:58
 */
public class Client {
    public static void main(String[] args) {

        // 盖普通 房子 ，这里用到了多态
        HouseBuilder commonHouse = new CommonHouse() ;
        // 准备创建房子的指挥者
        HouseDirector houseDirector = new HouseDirector(commonHouse) ;

        // 完成盖房子，返回产品（房子）
        House house = houseDirector.constructHouse() ;

        // System.out.println("输出流程");
        System.out.println("===========================");

        // 盖高楼
        HighBuilding highBuilding = new HighBuilding() ;
        // 重置建造者
        houseDirector.setHouseBuilder(highBuilding);
        // 完成盖房子，返回产品（高楼）
        houseDirector.constructHouse() ;
    }
}
