package com.example.javaresttemplate.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/*
RestControllerAdvice Annotation catches the errors of the program and produce response entity for you
to return it to the client.
In here we can do several things like:
We can write it to the Database
We can write log about error
We can send notification or mail about that exception so on...
 */
@RestControllerAdvice
public class GeneralExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(SymbolNotFoundException.class)
    public ResponseEntity<?> symbolNotFoundExceptionHandler(SymbolNotFoundException exception) {
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
