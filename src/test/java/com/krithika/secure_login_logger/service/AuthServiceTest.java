package com.krithika.secure_login_logger.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.krithika.secure_login_logger.service.AuthService;

public class AuthServiceTest {

    @Test
    void serviceShouldExist() {

        AuthService service = new AuthService(null, null, null);

        assertNotNull(service);

    }

}