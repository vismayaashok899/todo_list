package com.todo.user_service.exception;

import lombok.Getter;
import lombok.ToString;
import org.springframework.http.HttpStatus;

@Getter
@ToString
public class ValidationException extends RuntimeException {

    private static final long serialVersionUID = -364366680517769712L;

    private String errorCode;
    private String errorMessage;
    private HttpStatus httpStatus;
    public ValidationException(String errorCode, String errorMessage,HttpStatus httpStatus) {

        super(errorMessage);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.httpStatus=httpStatus;
    }
}
