package com.example.oraclestatuspagev2.web;

import com.example.oraclestatuspagev2.web.dto.ErrorDto;
import com.example.oraclestatuspagev2.web.exception.NotFoundException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.time.OffsetDateTime;

@RestControllerAdvice(basePackages = "com.example.oraclestatuspagev2.web.controller.api")
public class ErrorHandler {

    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public ErrorDto resourceNotFoundException(HttpServletRequest request, NotFoundException ex) {
        return ErrorDto.builder()
                .status(HttpStatus.NOT_FOUND.value())
                .error(ex.getMessage())
                .timestamp(OffsetDateTime.now().toString())
                .path(request.getRequestURI())
                .method(request.getMethod())
                .build();
    }

    @ExceptionHandler(EmptyResultDataAccessException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public ErrorDto emptyResultDataAccessException(HttpServletRequest request, EmptyResultDataAccessException ex) {
        return ErrorDto.builder()
                .status(HttpStatus.NOT_FOUND.value())
                .error(ex.getMessage())
                .timestamp(OffsetDateTime.now().toString())
                .path(request.getRequestURI())
                .method(request.getMethod())
                .build();
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorDto handleValidationExceptions(HttpServletRequest request, MethodArgumentNotValidException ex) {
        return ErrorDto.builder()
                .status(HttpStatus.BAD_REQUEST.value())
                .error(ex.getMessage())
                .timestamp(OffsetDateTime.now().toString())
                .path(request.getRequestURI())
                .method(request.getMethod())
                .build();
    }
}
