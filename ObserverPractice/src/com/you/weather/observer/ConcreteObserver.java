package com.you.weather.observer;
/**
 * ����Ǳ�ڵĹ۲��߱���ʵ������ӿ�,����״̬��ʽ�ı�ʱͨ������update����,����״̬,�۲��߱���ע���������,�Ա��������
 * �۲���������������������״̬��ʱ�ı�,�����Ͳ�����һ��1�Զ�Ĺ�ϵ
 * @author Yorick
 *
 */
public class ConcreteObserver implements Observer,DisplayElement{
	private float temperature;
	private float humidiry;
	//���������������,����ע���ȡ��
	private Subject weatherData;
	//��Ϊע��ʱ����,�������
	public ConcreteObserver(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	//״̬����
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidiry = humidity;
		//������ʾ����
		display();
	}
	
	@Override
	public void display() {
		System.out.println("temperature:"+temperature+"  "+"humidiry:"+humidiry);
	}
	
}