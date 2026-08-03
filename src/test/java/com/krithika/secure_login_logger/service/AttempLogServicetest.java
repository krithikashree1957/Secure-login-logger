package com.krithika.secure_login_logger.service;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Instant;

import org.junit.jupiter.api.Test;

import com.krithika.secure_login_logger.entity.AttemptLog;

class AttempLogServicetest {

    @Test
    void shouldCreateAttemptLog() {

        AttemptLog log = new AttemptLog(
                "krithika@gmail.com",
                true,
                Instant.now());

        assertEquals("krithika@gmail.com", log.getEmail());

        assertTrue(log.isSuccess());
    }
}