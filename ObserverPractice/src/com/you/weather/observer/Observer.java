package com.you.weather.observer;

public interface Observer {
	//���еĹ۲��߶�����ʵ��update����,��ʵ�ֹ۲��߽ӿ�
	public void update(float temp,float humidity,float pressure);
}