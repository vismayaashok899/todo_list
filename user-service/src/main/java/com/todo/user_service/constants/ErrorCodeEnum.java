package com.todo.user_service.constants;

public enum ErrorCodeEnum {
    EMAIL_ERROR("10000", "Email is already in user");
    //INVALID_AMOUNT("100001", "Amount cannot be negative, please correct and try again"),
    private String errorCode;
    private String errorMessage;

    ErrorCodeEnum(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
