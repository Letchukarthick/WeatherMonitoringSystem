package com.shaif.zeotap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ZeotapWeatherMonitoringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZeotapWeatherMonitoringApplication.class, args);
	}

}