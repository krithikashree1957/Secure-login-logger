package com.krithika.secure_login_logger.dto;
//DTO (Data Transfer Object).
//DTO represents the data that will be sent from the client to the server when a user registers for an account. 
// It contains two fields: email and password, along with their corresponding getters and setters.

public class RegisterRequest {

    private String email;
    private String password;

    public RegisterRequest() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}