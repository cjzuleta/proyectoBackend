package com.Tech.energy_app.repository;

import com.Tech.energy_app.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

/**
 * Repositorio para la entidad UserEntity
 */
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    // Buscar usuario por username
    Optional<UserEntity> findByUsername(String username);

    // Buscar usuario por email
    Optional<UserEntity> findByEmail(String email);
}
