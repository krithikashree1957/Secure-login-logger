package com.krithika.secure_login_logger.controller;
import org.springframework.web.bind.annotation.RestController;
import com.krithika.secure_login_logger.service.AuthService;
import org.springframework.web.bind.annotation.PostMapping;
@RestController
public class AuthController {
    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }
    @PostMapping("/register")//Whenever someone sends a POST request to /register, run the method below.
    public String register() {
        return "Register endpoint is working!";
}
}
