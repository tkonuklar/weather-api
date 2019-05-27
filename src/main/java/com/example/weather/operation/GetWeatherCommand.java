package com.example.weather.operation;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class GetWeatherCommand {
    private String name;
}
