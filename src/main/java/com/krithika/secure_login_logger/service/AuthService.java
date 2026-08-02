package com.krithika.secure_login_logger.service;
import com.krithika.secure_login_logger.repository.UserRepository;
import org.springframework.stereotype.Service;
import com.krithika.secure_login_logger.dto.RegisterRequest;
import com.krithika.secure_login_logger.entity.User;
import org.springframework.security.crypto.password.PasswordEncoder;

@Service
public class AuthService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public AuthService(UserRepository userRepository, PasswordEncoder passwordEncoder) 
    {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
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
}
