package com.api.weather;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.URI;
import org.apache.commons.httpclient.methods.GetMethod;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//import jakarta.servlet.http.HttpServletResponse;
import springfox.documentation.annotations.ApiIgnore;

@RestController
public class WeatherAPIController {

	Logger logger = org.slf4j.LoggerFactory.getLogger(WeatherAPIController.class);

	public WeatherAPIController() {
		super();
		// TODO Auto-generated constructor stub
	}

	WeatherAPIBusinessLogic busiLogic;

	@Autowired
	public WeatherAPIController(WeatherAPIBusinessLogic busiLogic) {
		this.busiLogic = busiLogic;
	}

	@RequestMapping(value = "/weather", method = RequestMethod.GET)
	public Double getTemperature(@RequestParam(value = "latitude") Double latitude,
			@RequestParam(value = "longitude") Double longitude) {

		try {
			logger.info("Entered inside Contoller");
			WeatherAPIRequest request = null;

			if (latitude == null || longitude == null) {
				return null;
			}
			if (latitude != null && longitude != null) {
				request = new WeatherAPIRequest(latitude, longitude);
			}

			return busiLogic.processRequest(request);

		} catch (Exception e) {
			logger.info("Exception while retrieveing Temperature from Meteo.com " + e.getMessage());
			// return new WeatherAPIResponse(latitude, longitude, null, null, null, null,
			// null, null);
			return 0.0;

		}

	}

	@ApiIgnore
	@RequestMapping(value = "/swagger.json", method = RequestMethod.GET)
	public String getSwagger() throws HttpException, IOException {

		HttpClient client = new HttpClient();
		GetMethod method = new GetMethod();
		// method.setURI(new URI("http://127.0.0.1:" + System.getenv("SERVER_PORT") +
		// "/v2/api-docs", false));
		method.setURI(new URI("http://127.0.0.1:8080/v2/api-docs", false));
		client.executeMethod(method);

		StringBuilder builder = new StringBuilder();
		InputStream in = method.getResponseBodyAsStream();

		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		String line;
		StringBuffer buffer = new StringBuffer();
		while ((line = reader.readLine()) != null) {
			buffer.append(line);
			buffer.append("");
		}
		reader.close();
		return buffer.toString();
	}

	@ExceptionHandler
	void handleException(Exception e, HttpServletResponse response) throws IOException {
		response.sendError(HttpStatus.CONFLICT.value());
	}

}
