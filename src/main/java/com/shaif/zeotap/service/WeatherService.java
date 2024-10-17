package com.shaif.zeotap.service;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    @Value("${weather.api.url}")
    private String apiUrl;

    @Value("${weather.api.key}")
    private String apiKey;

    private final RestTemplate restTemplate = new RestTemplate();

    /**
     * Fetch weather data for a specific city using OpenWeatherMap's 2.5/weather API.
     * @param city The name of the city (e.g., "London,uk").
     * @return String containing the JSON weather data.
     */
    public String getWeatherForCity(String city) {
        String url = apiUrl
                .replace("{city}", city)
                .replace("{key}", apiKey);
        
        // Fetch the weather data from the API
        return restTemplate.getForObject(url, String.class);
    }
}
