##### **README.md (Weather Monitoring System)**

# Weather Monitoring System

## Overview
This project is a real-time weather monitoring system that retrieves weather data from the OpenWeatherMap API. It allows users to fetch weather data for different cities and customize the data returned (e.g., exclude minutely, hourly data).

## Features
- Fetch real-time weather data for specific cities.
- Customize data exclusions (minutely, hourly, daily).
- Supports metric, imperial, and standard units for temperature.

## Technologies Used
- **Java 17**
- **Spring Boot 2.3.4**
- **OpenWeatherMap API**
- **RestTemplate** for making HTTP requests
- **Spring Scheduling** (for future features)

## How to Run

1. Clone this repository:
   ```bash
   git clone https://github.com/Letchukarthick/WeatherMonitoringSystem.git
   ```
2. Get your OpenWeatherMap API key:
   - Sign up at OpenWeatherMap to get your free API key.
3. Update the application.properties file located in src/main/resources with your API key:
   ```
   weather.api.url=https://api.openweathermap.org/data/2.5/weather?q={city}&appid={key}
   weather.api.key=your_openweathermap_api_key
   ```
4. Run the application:
   ```
   mvn spring-boot:run
   ```
5. The application will be available at http://localhost:8080

# API Endpoints
## Get Weather by City:
- GET /api/weather?city={city_name}
- Example: http://localhost:8080/api/weather?city=Mumbai
- Response: Current weather data for the specified city.

# Example API Response
```
{"coord":{"lon":72.8479,"lat":19.0144},"weather":[{"id":721,"main":"Haze","description":"haze","icon":"50n"}],"base":"stations","main":{"temp":300.14,"feels_like":301.59,"temp_min":300.14,"temp_max":300.14,"pressure":1010,"humidity":65,"sea_level":1010,"grnd_level":1009},"visibility":2500,"wind":{"speed":2.57,"deg":110},"clouds":{"all":20},"dt":1729890467,"sys":{"type":1,"id":9052,"country":"IN","sunrise":1729904783,"sunset":1729946309},"timezone":19800,"id":1275339,"name":"Mumbai","cod":200}```

