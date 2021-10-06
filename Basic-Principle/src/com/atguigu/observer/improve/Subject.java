package com.atguigu.observer.improve;

/**
 * @author shengxiao
 * @date 2021/9/28 18:59
 */

// 接口，让WeatherData 来实现
// 此接口 相当于 气象局 【即 被观察方】，故需要对其进行定义三个 为观察者 操作的方法
public interface Subject {

    // 注册观察者
    public void registerObserver(Observer o) ;

    // 移除观察者
    public void removeObserver(Observer o) ;

    // 通知观察者
    public void notifyObservers() ;
}
