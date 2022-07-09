package com.example.demo.security.securePasswordStorage.repository;

import com.example.demo.security.securePasswordStorage.entity.UserRoles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRolesRepository extends JpaRepository<UserRoles, Integer> {
}