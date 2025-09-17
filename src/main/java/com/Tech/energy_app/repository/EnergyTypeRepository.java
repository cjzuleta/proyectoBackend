/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tech.energy_app.repository;

/**
 *
 * @author Cj Zuleta
 */
import com.Tech.energy_app.model.EnergyType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnergyTypeRepository extends JpaRepository<EnergyType, Integer> {
    // Métodos CRUD listos: save, findAll, findById, deleteById...
}