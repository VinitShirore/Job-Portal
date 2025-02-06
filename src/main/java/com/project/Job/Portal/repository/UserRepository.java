package com.project.Job.Portal.repository;
import com.project.Job.Portal.model.User;  // Import the User entity
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

// JpaRepository<User, Long> means this repository handles User entities with a Long ID
public interface UserRepository extends JpaRepository<User, Long> {
    // Find a user by email (Spring JPA automatically creates the query)
    Optional<User> findByEmail(String email);
}
