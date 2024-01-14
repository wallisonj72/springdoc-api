package com.wallison.springdoc.repository;

import com.wallison.springdoc.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findAllById(Long id);
}
