package com.krithika.secure_login_logger.security;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SecurityTest {

    @Test
    void passwordShouldBeEncrypted() {

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        String password = "mypassword";

        String encoded = encoder.encode(password);

        assertNotEquals(password, encoded);

        assertTrue(encoder.matches(password, encoded));
    }
}