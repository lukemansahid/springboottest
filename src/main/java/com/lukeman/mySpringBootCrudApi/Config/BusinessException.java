package com.lukeman.mySpringBootCrudApi.Config;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class BusinessException extends RuntimeException{

    private String errorCode;
    private String errorMessage;

    public BusinessException() {
    }

    public BusinessException(String errorCode, String errorMessage){
        super();
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

}
