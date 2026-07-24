package com.vtr.vtrbank.role.repo;

import com.vtr.vtrbank.role.entity.PasswordResetCode;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PasswordResetCodeRepo extends JpaRepository<PasswordResetCodeRepo, Long> {
    Optional<PasswordResetCode> findByCode(String code);
    void deleteByUserId(Long userId);
}
