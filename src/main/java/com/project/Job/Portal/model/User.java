package com.project.Job.Portal.model;


import jakarta.persistence.*;   // JPA annotations for mapping this class to a database table
import lombok.*;              // Lombok to reduce boilerplate code

@Entity                      // Marks this class as a database entity (table)
@Table(name = "users")       // The table name in the database will be "users"
@Getter                      // Lombok generates getter methods for all fields
@Setter                      // Lombok generates setter methods for all fields
@NoArgsConstructor           // Generates a no-argument constructor
@AllArgsConstructor          // Generates a constructor with all fields
public class User {

    @Id  // Marks this as the Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment the ID
    private Long id;

    @Column(unique = true, nullable = false)  // Email must be unique and cannot be null
    private String email;

    @Column(nullable = false)  // Password cannot be null
    private String password;

    @Enumerated(EnumType.STRING) // This field stores an ENUM (Admin, Job Seeker, Recruiter)
    private Role role;
}
