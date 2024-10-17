package com.shaif.zeotap.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shaif.zeotap.service.WeatherService;

@RestController
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    /**
     * API endpoint to get weather data for a given city.
     * @param city Name of the city (e.g., "London,uk").
     * @return Weather data JSON response.
     */
    @GetMapping("/api/weather")
    public String getWeather(@RequestParam String city) {
        return weatherService.getWeatherForCity(city);
    }
}
