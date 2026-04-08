package com.jobportal.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jobportal.backend.User;

public interface UserRepository extends JpaRepository<User, Long> {
}