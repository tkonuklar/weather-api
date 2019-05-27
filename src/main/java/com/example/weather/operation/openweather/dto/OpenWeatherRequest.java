package com.example.weather.operation.openweather.dto;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class OpenWeatherRequest {
    private String cityName;
}
