package com.todo.user_service.POJO;

import lombok.Data;

@Data
public class EmailError {
    private String errorCode;
    private String errorMessage;

    public EmailError(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}
