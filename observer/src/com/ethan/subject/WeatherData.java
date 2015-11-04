package com.ethan.subject;

import java.util.ArrayList;

import com.ethan.interfaces.Observer;
import com.ethan.interfaces.Subject;

public class WeatherData implements Subject {
	private ArrayList<Observer> observerList = new ArrayList<Observer>();
	private float temperature;
	private float humidity;
	private float pressure;
	
	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}
	
	public float getTemperature(){
		return this.temperature;
	}
	
	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	@Override
	public void registerObserver(Observer o) {
		System.out.println(o.toString());
		observerList.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		if(observerList.indexOf(o) >= 0){
			observerList.remove(o);
		}
	}
	
	public void measurementChanged(){
		notifyObserver();
	}
	
	@Override
	public void notifyObserver() {
		for (int i = 0; i < observerList.size(); i++) {
			(observerList.get(i)).update(temperature, humidity, pressure);
		}
	}
	public void setMeasurements(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementChanged();
		
	}
}
