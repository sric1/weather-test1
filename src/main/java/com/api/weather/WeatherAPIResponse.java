
package com.api.weather;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "latitude",
    "longitude",
    "generationtime_ms",
    "utc_offset_seconds",
    "timezone",
    "timezone_abbreviation",
    "elevation",
    "current_units",
    "current"
})
@Generated("jsonschema2pojo")
public class WeatherAPIResponse implements Serializable
{

    @JsonProperty("latitude")
    private Double latitude;
    @JsonProperty("longitude")
    private Double longitude;
    @JsonProperty("generationtime_ms")
    private Double generationtimeMs;
    @JsonProperty("utc_offset_seconds")
    private Integer utcOffsetSeconds;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("timezone_abbreviation")
    private String timezoneAbbreviation;
    @JsonProperty("elevation")
    private Double elevation;
    @JsonProperty("current_units")
    @Valid
    private CurrentUnits currentUnits;
    @JsonProperty("current")
    @Valid
    private Current current;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -6267205396085987265L;

    
	public WeatherAPIResponse(Double latitude, Double longitude, Double generationtimeMs, Integer utcOffsetSeconds,
			String timezone, String timezoneAbbreviation, Double elevation, @Valid CurrentUnits currentUnits) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
		this.generationtimeMs = generationtimeMs;
		this.utcOffsetSeconds = utcOffsetSeconds;
		this.timezone = timezone;
		this.timezoneAbbreviation = timezoneAbbreviation;
		this.elevation = elevation;
		this.currentUnits = currentUnits;
		this.current = current;
		this.additionalProperties = additionalProperties;
	}

	@JsonProperty("latitude")
    public Double getLatitude() {
        return latitude;
    }

    @JsonProperty("latitude")
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public WeatherAPIResponse withLatitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }

    @JsonProperty("longitude")
    public Double getLongitude() {
        return longitude;
    }

    @JsonProperty("longitude")
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public WeatherAPIResponse withLongitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }

    @JsonProperty("generationtime_ms")
    public Double getGenerationtimeMs() {
        return generationtimeMs;
    }

    @JsonProperty("generationtime_ms")
    public void setGenerationtimeMs(Double generationtimeMs) {
        this.generationtimeMs = generationtimeMs;
    }

    public WeatherAPIResponse withGenerationtimeMs(Double generationtimeMs) {
        this.generationtimeMs = generationtimeMs;
        return this;
    }

    @JsonProperty("utc_offset_seconds")
    public Integer getUtcOffsetSeconds() {
        return utcOffsetSeconds;
    }

    @JsonProperty("utc_offset_seconds")
    public void setUtcOffsetSeconds(Integer utcOffsetSeconds) {
        this.utcOffsetSeconds = utcOffsetSeconds;
    }

    public WeatherAPIResponse withUtcOffsetSeconds(Integer utcOffsetSeconds) {
        this.utcOffsetSeconds = utcOffsetSeconds;
        return this;
    }

    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public WeatherAPIResponse withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    @JsonProperty("timezone_abbreviation")
    public String getTimezoneAbbreviation() {
        return timezoneAbbreviation;
    }

    @JsonProperty("timezone_abbreviation")
    public void setTimezoneAbbreviation(String timezoneAbbreviation) {
        this.timezoneAbbreviation = timezoneAbbreviation;
    }

    public WeatherAPIResponse withTimezoneAbbreviation(String timezoneAbbreviation) {
        this.timezoneAbbreviation = timezoneAbbreviation;
        return this;
    }

    @JsonProperty("elevation")
    public Double getElevation() {
        return elevation;
    }

    @JsonProperty("elevation")
    public void setElevation(Double elevation) {
        this.elevation = elevation;
    }

    public WeatherAPIResponse withElevation(Double elevation) {
        this.elevation = elevation;
        return this;
    }

    @JsonProperty("current_units")
    public CurrentUnits getCurrentUnits() {
        return currentUnits;
    }

    @JsonProperty("current_units")
    public void setCurrentUnits(CurrentUnits currentUnits) {
        this.currentUnits = currentUnits;
    }

    public WeatherAPIResponse withCurrentUnits(CurrentUnits currentUnits) {
        this.currentUnits = currentUnits;
        return this;
    }

    @JsonProperty("current")
    public Current getCurrent() {
        return current;
    }

    @JsonProperty("current")
    public void setCurrent(Current current) {
        this.current = current;
    }

    public WeatherAPIResponse withCurrent(Current current) {
        this.current = current;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public WeatherAPIResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(WeatherAPIResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("latitude");
        sb.append('=');
        sb.append(((this.latitude == null)?"<null>":this.latitude));
        sb.append(',');
        sb.append("longitude");
        sb.append('=');
        sb.append(((this.longitude == null)?"<null>":this.longitude));
        sb.append(',');
        sb.append("generationtimeMs");
        sb.append('=');
        sb.append(((this.generationtimeMs == null)?"<null>":this.generationtimeMs));
        sb.append(',');
        sb.append("utcOffsetSeconds");
        sb.append('=');
        sb.append(((this.utcOffsetSeconds == null)?"<null>":this.utcOffsetSeconds));
        sb.append(',');
        sb.append("timezone");
        sb.append('=');
        sb.append(((this.timezone == null)?"<null>":this.timezone));
        sb.append(',');
        sb.append("timezoneAbbreviation");
        sb.append('=');
        sb.append(((this.timezoneAbbreviation == null)?"<null>":this.timezoneAbbreviation));
        sb.append(',');
        sb.append("elevation");
        sb.append('=');
        sb.append(((this.elevation == null)?"<null>":this.elevation));
        sb.append(',');
        sb.append("currentUnits");
        sb.append('=');
        sb.append(((this.currentUnits == null)?"<null>":this.currentUnits));
        sb.append(',');
        sb.append("current");
        sb.append('=');
        sb.append(((this.current == null)?"<null>":this.current));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.elevation == null)? 0 :this.elevation.hashCode()));
        result = ((result* 31)+((this.current == null)? 0 :this.current.hashCode()));
        result = ((result* 31)+((this.generationtimeMs == null)? 0 :this.generationtimeMs.hashCode()));
        result = ((result* 31)+((this.utcOffsetSeconds == null)? 0 :this.utcOffsetSeconds.hashCode()));
        result = ((result* 31)+((this.timezone == null)? 0 :this.timezone.hashCode()));
        result = ((result* 31)+((this.latitude == null)? 0 :this.latitude.hashCode()));
        result = ((result* 31)+((this.currentUnits == null)? 0 :this.currentUnits.hashCode()));
        result = ((result* 31)+((this.timezoneAbbreviation == null)? 0 :this.timezoneAbbreviation.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.longitude == null)? 0 :this.longitude.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WeatherAPIResponse) == false) {
            return false;
        }
        WeatherAPIResponse rhs = ((WeatherAPIResponse) other);
        return (((((((((((this.elevation == rhs.elevation)||((this.elevation!= null)&&this.elevation.equals(rhs.elevation)))&&((this.current == rhs.current)||((this.current!= null)&&this.current.equals(rhs.current))))&&((this.generationtimeMs == rhs.generationtimeMs)||((this.generationtimeMs!= null)&&this.generationtimeMs.equals(rhs.generationtimeMs))))&&((this.utcOffsetSeconds == rhs.utcOffsetSeconds)||((this.utcOffsetSeconds!= null)&&this.utcOffsetSeconds.equals(rhs.utcOffsetSeconds))))&&((this.timezone == rhs.timezone)||((this.timezone!= null)&&this.timezone.equals(rhs.timezone))))&&((this.latitude == rhs.latitude)||((this.latitude!= null)&&this.latitude.equals(rhs.latitude))))&&((this.currentUnits == rhs.currentUnits)||((this.currentUnits!= null)&&this.currentUnits.equals(rhs.currentUnits))))&&((this.timezoneAbbreviation == rhs.timezoneAbbreviation)||((this.timezoneAbbreviation!= null)&&this.timezoneAbbreviation.equals(rhs.timezoneAbbreviation))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.longitude == rhs.longitude)||((this.longitude!= null)&&this.longitude.equals(rhs.longitude))));
    }

}
