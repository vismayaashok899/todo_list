package com.todo.user_service.exception;

import com.todo.user_service.POJO.EmailError;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice
public class ValidationExceptionHandler {
    @ExceptionHandler(ValidationException.class)
    public ResponseEntity<EmailError> handleCustomUncheckedException(ValidationException ex) {
        log.error("------ ValidationException occurred: {}", ex);

        EmailError emailError = new EmailError(
                ex.getErrorCode(), ex.getErrorMessage());

        log.info("Returning from ValidationExceptionHandler: {}", emailError);

        return new ResponseEntity<>(emailError,ex.getHttpStatus());
    }
}
