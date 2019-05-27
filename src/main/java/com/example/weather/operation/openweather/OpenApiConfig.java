package com.example.weather.operation.openweather;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties("open-api")
public class OpenApiConfig {
    private String baseUrl;
    private String apiKey;
}
