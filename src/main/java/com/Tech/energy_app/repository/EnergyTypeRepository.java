package com.Tech.energy_app.repository;

import com.Tech.energy_app.model.EnergyType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnergyTypeRepository extends JpaRepository<EnergyType, Integer> {
    // Métodos CRUD listos: save, findAll, findById, deleteById...
}
