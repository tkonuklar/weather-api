package com.example.weather.api.rest;

import com.example.weather.operation.WeatherOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class WeatherController extends CommonController {

    private static final String WEATHER_API_CITY_BY_NAME = API_V1 + "/weather/city/{name}";

    private final WeatherOperation weatherOperation;

    WeatherController(final WeatherOperation weatherOperation) {
        this.weatherOperation = weatherOperation;
    }

    @GetMapping(WEATHER_API_CITY_BY_NAME)
    ResponseEntity<String> getByName(@PathVariable final String name) {
        log.info("Retrieve weather details for city {}", name);
        return ResponseEntity.ok("OK");
    }

}
