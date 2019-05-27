package com.example.weather.api.dto;

import lombok.Builder;
import lombok.Value;

import java.util.List;

@Value
@Builder
public class ErrorDetailsResponse {
    private String code;
    private List<String> arguments;
    private String message;
}
