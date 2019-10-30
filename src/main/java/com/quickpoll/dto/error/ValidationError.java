package com.quickpoll.dto.error;

public class ValidationError {
    private String code;
    private String message;
    // Getters and Setters removed for brevity

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
