package com.example.weather.operation;

import com.example.weather.domain.Error;
import com.example.weather.domain.weather.Weather;
import com.example.weather.operation.openweather.OpenWeatherApiClient;
import com.example.weather.operation.openweather.dto.OpenWeatherRequest;
import com.example.weather.operation.openweather.dto.OpenWeatherResponse;
import io.vavr.control.Validation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class WeatherOperation {

    private final OpenWeatherApiClient openWeatherApiClient;

    WeatherOperation(final OpenWeatherApiClient openWeatherApiClient) {
        this.openWeatherApiClient = openWeatherApiClient;
    }

    public Validation<Error, Weather> getByCity(final GetWeatherCommand command) {
        return openWeatherApiClient.getByCity(toRequest(command))
                .map(this::toWeather);
    }

    private OpenWeatherRequest toRequest(final GetWeatherCommand command) {
        return OpenWeatherRequest.builder().cityName(command.getName()).build();
    }

    private Weather toWeather(final OpenWeatherResponse response) {
        return null;
    }
}
