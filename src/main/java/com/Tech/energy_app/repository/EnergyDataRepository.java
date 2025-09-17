package com.Tech.energy_app.repository;

import com.Tech.energy_app.model.EnergyData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnergyDataRepository extends JpaRepository<EnergyData, Integer> {
    // Métodos CRUD listos
}
