package com.atguigu.observer.improve;

import com.atguigu.observer.CurrentConditions;

import java.util.ArrayList;
import java.util.List;

/**
 * 类是核心
 * 1. 包含最新的天气情况信息 
 * 2. 含有 观察者集合，使用ArrayList管理
 * 3. 当数据有更新时，就主动的调用  ArrayList,通知所有的(接入方)，这样他们（接入方）就看到最新的信息
 * @author Administrator
 *
 */

// 待观察者 观察 的 【被观察方 -- 即 被观察对象】
// 综上：WeatherData是 被观察的对象，即被观察方
// 因为此处使用的是 将 "更新的数据" 推送 给 Observer【观察者】
// 更新的数据 是放在 WeatherData 中，此时需要推送给 Observer
// 但 推送的前提：先需要注册 观察者，然后再 通知 观察者，而且这里可能通知的观察者不止一方，可能存在多个第三方
// 所以，这里使用 List<Observer> 集合来存储，从而简化代码。
public class WeatherData implements Subject {
	private float temperatrue;
	private float pressure;
	private float humidity;

	// 观察者集合
	private List<Observer> observers ;

	//加入新的第三方

	public WeatherData() {
		observers = new ArrayList<>() ;
	}

	public float getTemperature() {
		return temperatrue;
	}

	public float getPressure() {
		return pressure;
	}

	public float getHumidity() {
		return humidity;
	}

	public void dataChange() {
		//调用 接入方的 update
		//currentConditions.update(getTemperature(), getPressure(), getHumidity());
		notifyObservers();
	}

	//当数据有更新时，就调用 setData
	public void setData(float temperature, float pressure, float humidity) {
		this.temperatrue = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		//调用dataChange， 将最新的信息 推送给 接入方 currentConditions
		dataChange();
	}

	// 注册一个观察者
	@Override
	public void registerObserver(Observer o) {
		//
		observers.add(o);

	}

	// 移除一个观察者
	@Override
	public void removeObserver(Observer o) {
		if(observers.contains(o)){
			observers.remove(o) ;
		}
	}

	// 遍历所有的观察者，并通知
	@Override
	public void notifyObservers() {

		for(int i = 0 ; i < observers.size() ; i++){
			observers.get(i).update(this.temperatrue, this.pressure, this.humidity);
		}
	}
}
