package com.atguigu.observer.improve;

/**
 * @author shengxiao
 * @date 2021/9/28 19:09
 */

// 显示当前天气情况（可以理解成是气象站自己的网站【本网站】，注意：这并非是第三方网站【eg：新浪，百度】
// 但切记：观察者可以是 气象站自己的网站，或者是 第三方网站
public class CurrentConditions implements Observer {

    // 温度，气压，湿度
    private float temperature;
    private float pressure;
    private float humidity;

    //更新 天气情况，是由 WeatherData 来调用，我使用推送模式
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    //显示
    public void display() {
        System.out.println("***Today mTemperature: " + temperature + "***");
        System.out.println("***Today mPressure: " + pressure + "***");
        System.out.println("***Today mHumidity: " + humidity + "***");
    }
}
