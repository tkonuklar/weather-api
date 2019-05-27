package com.example.weather.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;

import java.util.List;

@Value
@Builder
public class Error {
    private ErrorCodeType type;
    private String code;
    private List<String> arguments;
    @Getter(lazy=true)
    private int status = type.statusCode();
    private List<ErrorDetails> errorDetails;
}
