package com.you.weather.observer;
/**
 * 所有潜在的观察者必须实现这个接口,主题状态方式改变时通过调用update方法,传递状态,观察者必须注册具体主题,以便接收数据
 * 观察者依赖主题来告诉他们状态何时改变,这样就产生了一个1对多的关系
 * @author Yorick
 *
 */
public class ConcreteObserver implements Observer,DisplayElement{
	private float temperature;
	private float humidiry;
	//用来和主题绑定连接,用于注册和取消
	private Subject weatherData;
	//作为注册时候用,和主题绑定
	public ConcreteObserver(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	//状态更新
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidiry = humidity;
		//调用显示方法
		display();
	}
	
	@Override
	public void display() {
		System.out.println("temperature:"+temperature+"  "+"humidiry:"+humidiry);
	}
	
}
