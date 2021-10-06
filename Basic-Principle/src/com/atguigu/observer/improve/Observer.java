package com.atguigu.observer.improve;

/**
 * @author shengxiao
 * @date 2021/9/28 19:04
 */

// 观察者 接口, 由观察者来实现
public interface Observer {

    public void update(float temperature,float pressure,float humidity) ;
}
