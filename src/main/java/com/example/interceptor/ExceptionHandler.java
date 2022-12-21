package com.example.interceptor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandler {
    @org.springframework.web.bind.annotation.ExceptionHandler
    public ResponseEntity<String> handleInvalidHeader(InvalidHeaderFieldException invalidHeaderFieldException) {
        return ResponseEntity.badRequest().body(invalidHeaderFieldException.getMessage());
    }
}
