package com.krithika.secure_login_logger.controller;
import org.springframework.web.bind.annotation.RestController;
import com.krithika.secure_login_logger.service.AuthService;
import org.springframework.web.bind.annotation.PostMapping;
import com.krithika.secure_login_logger.dto.RegisterRequest;
import org.springframework.web.bind.annotation.RequestBody;
import com.krithika.secure_login_logger.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import com.krithika.secure_login_logger.entity.AttemptLog;

@RestController
public class AuthController {
    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }
    @PostMapping("/register")
    public String register(@RequestBody RegisterRequest request) {

        authService.register(request);

        return "User registered successfully.";

    }
    @PostMapping("/login")
    public String login(@RequestBody User user) {

         return authService.login(
            user.getEmail(),
            user.getPassword());

    }
    @GetMapping("/attempts/{email}")
    public List<AttemptLog> getAttempts(@PathVariable String email) {
        return authService.getAttempts(email);
    }
}
