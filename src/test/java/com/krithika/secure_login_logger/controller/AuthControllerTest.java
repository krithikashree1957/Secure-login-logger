package com.krithika.secure_login_logger.controller;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class AuthControllerTest {

    @Test
    void controllerShouldExist() {

        AuthController controller = new AuthController(null);

        assertNotNull(controller);

    }

}