package com.example.demo.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;



@RestControllerAdvice
public class CustomerControllerAdvice {

    @ExceptionHandler(value = NoSuchCustomer.class)
    public ResponseEntity<ErrorMessage> exceptionHandler(NoSuchCustomer ex){
        ErrorMessage errorMessage=new ErrorMessage();
        errorMessage.setErrorCode(HttpStatus.BAD_GATEWAY.value());
        errorMessage.setMessage(ex.getMsg());
        return new ResponseEntity<>(errorMessage,HttpStatus.OK);
    }




}
