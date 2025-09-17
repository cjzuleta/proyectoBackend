/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tech.energy_app.repository;

/**
 *
 * @author Cj Zuleta
 */
import com.Tech.energy_app.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    // Método extra: buscar por username
    Optional<UserEntity> findByUsername(String username);
}
