package com.example.authsystem.dto;

public class AuthResponse {
    private String token;

    // Default constructor
    public AuthResponse() {}

    // Constructor with token
    public AuthResponse(String token) {
        this.token = token;
    }

    // Getter and Setter
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
