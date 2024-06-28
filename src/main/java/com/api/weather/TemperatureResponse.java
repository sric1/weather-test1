package com.api.weather;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TemperatureResponse {
	
	@JsonProperty("temperature_2m")
    private Double temperature2m;

	@Override
	public String toString() {
		return "TemperatureResponse [temperature2m=" + temperature2m + "]";
	}

	public TemperatureResponse(Double temperature2m) {
		super();
		this.temperature2m = temperature2m;
	}

	public TemperatureResponse() {
		// TODO Auto-generated constructor stub
	}

	public Double getTemperature2m() {
		return temperature2m;
	}

	public void setTemperature2m(Double temperature2m) {
		this.temperature2m = temperature2m;
	}

}
