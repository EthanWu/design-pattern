package com.ethan.observer;


import com.ethan.interfaces.Display;
import com.ethan.interfaces.Observer;


public class CurrentConditionsDisplay implements Display, Observer {
	private float temperature = 0;
	private float humidity = 0;

	public CurrentConditionsDisplay(){
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temperature = temp;
		this.humidity = humidity;
		this.display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("The current temperature is "+ this.temperature + "degree,and the humidity is "
				+ this.humidity + ". Reported by CurrentConditionsDisplay.");
	}

}
