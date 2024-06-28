package com.api.weather;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class WeatherAPIRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5714873814615483092L;

	@NotNull // makes it so @Validated fails if this field is null
	@ApiModelProperty(required = true)
	@JsonProperty("latitude")
	private Double latitude = 0.0;

	@NotNull // makes it so @Validated fails if this field is null
	@ApiModelProperty(required = true)
	@JsonProperty("longitude")
	private Double longitude = 0.0;

	public WeatherAPIRequest() {

	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public WeatherAPIRequest(@NotNull Double latitude, @NotNull Double longitude) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
	}

	@Override
	public String toString() {
		return "WeatherAPIRequest [latitude=" + latitude + ", longitude=" + longitude + "]";
	}

}
