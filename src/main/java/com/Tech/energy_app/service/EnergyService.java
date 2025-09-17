package com.Tech.energy_app.service;

import com.Tech.energy_app.model.EnergyData;
import com.Tech.energy_app.model.EnergyType;
import com.Tech.energy_app.repository.EnergyDataRepository;
import com.Tech.energy_app.repository.EnergyTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnergyService {

    private final EnergyDataRepository energyDataRepository;
    private final EnergyTypeRepository energyTypeRepository;

    public EnergyService(EnergyDataRepository energyDataRepository,
                         EnergyTypeRepository energyTypeRepository) {
        this.energyDataRepository = energyDataRepository;
        this.energyTypeRepository = energyTypeRepository;
    }

    // --- Métodos para EnergyData ---
    public List<EnergyData> getAllEnergyData() {
        return energyDataRepository.findAll();
    }

    public Optional<EnergyData> getEnergyDataById(Integer id) {
        return energyDataRepository.findById(id);
    }

    public EnergyData saveEnergyData(EnergyData energyData) {
        return energyDataRepository.save(energyData);
    }

    public void deleteEnergyData(Integer id) {
        energyDataRepository.deleteById(id);
    }

    // --- Métodos para EnergyType ---
    public List<EnergyType> getAllEnergyTypes() {
        return energyTypeRepository.findAll();
    }

    public Optional<EnergyType> getEnergyTypeById(Integer id) {
        return energyTypeRepository.findById(id);
    }

    public EnergyType saveEnergyType(EnergyType energyType) {
        return energyTypeRepository.save(energyType);
    }

    public void deleteEnergyType(Integer id) {
        energyTypeRepository.deleteById(id);
    }
}
