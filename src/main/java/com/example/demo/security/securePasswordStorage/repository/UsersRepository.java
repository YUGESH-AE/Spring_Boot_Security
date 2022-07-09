package com.example.demo.security.securePasswordStorage.repository;

import com.example.demo.security.securePasswordStorage.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, String> {
}