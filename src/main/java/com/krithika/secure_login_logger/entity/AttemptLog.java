package com.krithika.secure_login_logger.entity;
import jakarta.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "attempt_logs")
public class AttemptLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private boolean success;
    private Instant timestamp;
    public AttemptLog(String email, boolean success, Instant timestamp) {
        this.email = email;
        this.success = success;
        this.timestamp = timestamp;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public boolean isSuccess() {
        return success;
    }
    public void setSuccess(boolean success) {
        this.success = success;
    }
    public Instant getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }
    

    // Constructors, getters, and setters
}