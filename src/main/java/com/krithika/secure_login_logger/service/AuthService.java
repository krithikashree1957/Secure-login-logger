package com.krithika.secure_login_logger.service;
import com.krithika.secure_login_logger.repository.UserRepository;
import org.springframework.stereotype.Service;
import com.krithika.secure_login_logger.dto.RegisterRequest;
import com.krithika.secure_login_logger.entity.User;

@Service
public class AuthService {
    private final UserRepository userRepository;

    public AuthService(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    public UserRepository getUserRepository() {
        return userRepository;
    }
    public void register(RegisterRequest request) {

    User user = new User();

    user.setEmail(request.getEmail());
    user.setPassword(request.getPassword());

    userRepository.save(user);
}
}
