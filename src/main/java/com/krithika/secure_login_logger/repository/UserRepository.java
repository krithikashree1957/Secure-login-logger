package com.krithika.secure_login_logger.repository;
import com.krithika.secure_login_logger.entity.User;//creating a repository interface for the User entity,
//  extending JpaRepository to provide CRUD operations and query methods for User objects in the database.
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User, Long> 
{//long is data type of primary key of user entity
    Optional<User> findByEmail(String email);//method to find a user by their email address, returning an Optional<User> to handle the case where the user may not exist.
}
