package com.example.weather.operation.openweather;

import com.example.weather.domain.Error;
import com.example.weather.operation.openweather.dto.OpenWeatherRequest;
import com.example.weather.operation.openweather.dto.OpenWeatherResponse;
import io.vavr.control.Validation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
@Slf4j
public class OpenWeatherApiClientOperation implements OpenWeatherApiClient {

    // http://api.openweathermap.org/data/2.5/forecast/daily?q=London&APPID=a7dd2cb164e9d36fd88132349b82d878

    private final WebClient webClient;
    private final OpenApiConfig openApiConfig;

    OpenWeatherApiClientOperation(
            final WebClient.Builder webClientBuilder,
            final OpenApiConfig openApiConfig
    ) {
        this.openApiConfig = openApiConfig;
        this.webClient = webClientBuilder.baseUrl(openApiConfig.getBaseUrl()).build();

    }

    @Override
    public Validation<Error, OpenWeatherResponse> getByCity(OpenWeatherRequest request) {
        return null;
    }
}
