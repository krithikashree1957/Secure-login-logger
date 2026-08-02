package com.krithika.secure_login_logger.service;
import com.krithika.secure_login_logger.repository.UserRepository;
import org.springframework.stereotype.Service;
import com.krithika.secure_login_logger.dto.RegisterRequest;
import com.krithika.secure_login_logger.entity.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import java.util.Optional;
import com.krithika.secure_login_logger.repository.AttemptLogRepository;
import com.krithika.secure_login_logger.entity.AttemptLog;
import java.time.Instant;

@Service
public class AuthService {
    private final AttemptLogRepository attemptLogRepository;
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public AuthService(UserRepository userRepository, PasswordEncoder passwordEncoder, AttemptLogRepository attemptLogRepository) 
    {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.attemptLogRepository = attemptLogRepository;
    }

    public UserRepository getUserRepository() {
        return userRepository;
    }
    public void register(RegisterRequest request) {

    User user = new User();

    user.setEmail(request.getEmail());
    user.setPassword(passwordEncoder.encode(request.getPassword()));

    userRepository.save(user);
    }

    public String login(String email, String password) {

        Optional<User> user = userRepository.findByEmail(email);

        boolean success = false;

        if (user.isPresent()) {
            success = passwordEncoder.matches(password, user.get().getPassword());
        }

        AttemptLog log = new AttemptLog(
                email,
                success,
                Instant.now());

        attemptLogRepository.save(log);

        if (success) {
            return "Login successful";
        }

        return "Invalid email or password";
    }
}
