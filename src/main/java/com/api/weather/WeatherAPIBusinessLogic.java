package com.api.weather;


import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherAPIBusinessLogic  {
	
	Logger logger = org.slf4j.LoggerFactory.getLogger(WeatherAPIBusinessLogic.class);
	
	/*@Value("${meteo.api.url}")
	String url;*/
	private final RestTemplate restTemplate;

	
	@Autowired
	public 
	WeatherAPIBusinessLogic (RestTemplate restTemplate) {
		this.restTemplate=restTemplate;
	}
	
	
	
	public Double processRequest(WeatherAPIRequest request)  {
		
		logger.info("Entered inside Businesslogic");
		
		String openurl = System.getenv("OPEN_WEATHER_URL");
		//String openurl ="http://api.open-meteo.com/v1/forecast";
		Double lat=request.getLatitude();
		Double lon=request.getLongitude();
		
		String openWeatherurl=openurl+"?latitude="+lat+"&longitude="+lon+"&current=temperature_2m";
		
		//WeatherAPIResponse weatherResponse ;
		WeatherAPIImpl weatherImpl=new WeatherAPIImpl();
		
		
		logger.info("Latitude: " +   lat+"Longitude: " +   lon);
		
		String weatherResponse=restTemplate.getForObject(openWeatherurl, String.class);
		logger.info("Response: " +   weatherResponse.toString());
		
		/*weatherResponse=restTemplate.getForObject("http://api.open-meteo.com/v1/forecast"+"?latitude="+lat+"&longitude="+lon+"&current=temperature_2m", WeatherAPIResponse.class);
		//weatherResponse=restTemplate.getForEntity("http://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&current=temperature_2m", WeatherAPIResponse.class);
		//System.out.println(weatherResponse.toString());*/
				
		return weatherImpl.getTemperature(weatherResponse);
	}
	

	

}
