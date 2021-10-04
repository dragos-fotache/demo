package com.example.demo.exception;

import com.example.demo.model.MyObj;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class DemoExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(SsdNotFoundException.class)
    @ResponseStatus(value = HttpStatus.I_AM_A_TEAPOT)
    public MyObj handleException(RuntimeException ex, WebRequest request) {

        return MyObj.builder().field1("field1").field2("field2").field3("field3").build();

    }

}
