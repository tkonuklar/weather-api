package com.example.weather.api.rest;

import com.example.weather.api.dto.ErrorDetailsResponse;
import com.example.weather.api.dto.ErrorResponse;
import com.example.weather.domain.Error;
import com.example.weather.domain.ErrorDetails;
import org.springframework.http.ResponseEntity;

import java.util.stream.Collectors;

abstract class CommonController {
    static final String API_V1 = "/api/v1";

    ResponseEntity<ErrorResponse> toErrorResponse(final Error error) {
        final var response = ErrorResponse.builder()
                .arguments(error.getArguments())
                .code(error.getCode())
                .type(error.getType())
                .errorDetails(error.getErrorDetails()
                        .stream()
                        .map(this::toErrorDetailResponse)
                        .collect(Collectors.toList()))
                .build();
        return ResponseEntity.status(error.getStatus()).body(response);
    }

    ErrorDetailsResponse toErrorDetailResponse(final ErrorDetails errorDetails) {
        return ErrorDetailsResponse.builder()
                .arguments(errorDetails.getArguments())
                .code(errorDetails.getCode())
                .message(errorDetails.getMessage())
                .build();
    }
}
