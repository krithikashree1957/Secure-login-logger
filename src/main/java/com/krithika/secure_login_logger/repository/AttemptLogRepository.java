package com.krithika.secure_login_logger.repository;
import com.krithika.secure_login_logger.entity.AttemptLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttemptLogRepository extends JpaRepository<AttemptLog, Long> {

}
