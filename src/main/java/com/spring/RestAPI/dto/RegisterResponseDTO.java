package com.spring.RestAPI.dto;

public class RegisterResponseDTO {
    private String message;
    private String token;

    public RegisterResponseDTO(String message, String token) {
        this.message = message;
        this.token = token;
    }

    public String getMessage() {
        return message;
    }

    public String getToken() {
        return token;
    }
}
