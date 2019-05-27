package com.example.weather.api.dto;

import com.example.weather.domain.ErrorCodeType;
import lombok.Builder;
import lombok.Getter;
import lombok.Value;

import java.util.List;

@Value
@Builder
public class ErrorResponse {

    private ErrorCodeType type;
    private String code;
    private List<String> arguments;
    @Getter(lazy=true)
    private int status = type.statusCode();
    private List<ErrorDetailsResponse> errorDetails;
}
