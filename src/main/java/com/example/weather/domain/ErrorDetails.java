package com.example.weather.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;

import java.util.List;

@Value
@Builder
public class ErrorDetails {
    private String code;
    private List<String> arguments;
    private String message;
}
