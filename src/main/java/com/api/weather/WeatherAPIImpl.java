package com.api.weather;

import org.json.JSONObject;
import org.slf4j.Logger;

public class WeatherAPIImpl {
	
	Logger logger = org.slf4j.LoggerFactory.getLogger(WeatherAPIImpl.class);
	
	
	public Double getTemperature(String weatherResponse)
	{
		logger.info("Entered inside Impl class");
		
		JSONObject response = new JSONObject(weatherResponse);
		JSONObject currentResponse=response.getJSONObject("current");
		Double temperatureResponse=currentResponse.getDouble("temperature_2m");
		
		logger.info("Temperature Response: " +   temperatureResponse);
		
		return temperatureResponse;
	}

}
