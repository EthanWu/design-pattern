package com.etan.simulate;

import com.ethan.observer.CurrentConditionsDisplay;
import com.ethan.subject.WeatherData;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay ccp = new CurrentConditionsDisplay();
		//ccp.observe();
		weatherData.registerObserver(ccp);
		weatherData.setMeasurements(1, 3, 5);
		weatherData.setMeasurements(3, 4, 8);
	}
}
