package com.atguigu.principle.single_responsibility;

/**
 * @author shengxiao
 * @date 2021/9/4 20:34
 */
public class SingleResponsibility2 {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle() ;
        vehicle.run("摩托车");
        vehicle.run("汽车");

        AirVehicle airVehicle = new AirVehicle() ;
        airVehicle.run("飞机");
    }
}

class RoadVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "公路运行");
    }
}

class AirVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "天空运行");
    }
}

class WaterVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "水中运行");
    }
}
