package com.example.weather.operation.openweather;

import com.example.weather.domain.Error;
import com.example.weather.operation.openweather.dto.OpenWeatherRequest;
import com.example.weather.operation.openweather.dto.OpenWeatherResponse;
import io.vavr.control.Validation;


public interface OpenWeatherApiClient {
    Validation<Error, OpenWeatherResponse> getByCity(final OpenWeatherRequest request);
}
