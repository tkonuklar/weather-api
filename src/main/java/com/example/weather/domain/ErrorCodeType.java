package com.example.weather.domain;

import org.springframework.http.HttpStatus;

public enum ErrorCodeType {

    BAD_REQUEST(HttpStatus.BAD_REQUEST),
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR);

    private HttpStatus status;

    ErrorCodeType(final HttpStatus status) {
        this.status = status;
    }

    public int statusCode(){
        return this.status.value();
    }
}
