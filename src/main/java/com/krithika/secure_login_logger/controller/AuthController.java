package com.krithika.secure_login_logger.controller;
import org.springframework.web.bind.annotation.RestController;
import com.krithika.secure_login_logger.service.AuthService;
import org.springframework.web.bind.annotation.PostMapping;
import com.krithika.secure_login_logger.dto.RegisterRequest;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
public class AuthController {
    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }
    @PostMapping("/register")
    public String register(@RequestBody RegisterRequest request) {

        return "Received registration request for " + request.getEmail();

    }
}
