/*
@Async ejecuta el método en otro hilo (no bloquea el hilo que llama).

calculateTotalProductionAsync() devuelve CompletableFuture<Double> para obtener resultado cuando esté listo.

Usamos logging con SLF4J.
 */
package com.Tech.energy_app.service;

/**
 *
 * @author Cj Zuleta
 */
import com.Tech.energy_app.exception.EnergyException;
import com.Tech.energy_app.model.EnergyData;
import com.Tech.energy_app.repository.EnergyDataRepository;
import com.Tech.energy_app.repository.EnergyTypeRepository;
import org.slf4j.*;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
public class EnergyService {

    private final EnergyDataRepository dataRepo;
    private final EnergyTypeRepository typeRepo;
    private final Logger log = LoggerFactory.getLogger(EnergyService.class);

    public EnergyService(EnergyDataRepository dataRepo, EnergyTypeRepository typeRepo) {
        this.dataRepo = dataRepo;
        this.typeRepo = typeRepo;
    }

    public List<EnergyData> getAllData() {
        try {
            return dataRepo.findAll();
        } catch (Exception e) {
            log.error("Error leyendo EnergyData", e);
            throw new EnergyException("No se pudo leer los datos de energía", e);
        }
    }

    public List<com.Tech.energy_app.model.EnergyType> getAllTypes() {
        try {
            return typeRepo.findAll();
        } catch (Exception e) {
            log.error("Error leyendo EnergyType", e);
            throw new EnergyException("No se pudo leer los tipos de energía", e);
        }
    }

    public double calculateTotalProduction() {
        try {
            return dataRepo.findAll().stream()
                    .mapToDouble(d -> d.getProduction() == null ? 0 : d.getProduction())
                    .sum();
        } catch (Exception e) {
            log.error("Error calculando producción", e);
            throw new EnergyException("Error calculando producción total", e);
        }
    }

    // Método asíncrono: se ejecuta en otro hilo y devuelve CompletableFuture
    @Async("taskExecutor")
    public CompletableFuture<Double> calculateTotalProductionAsync() {
        double total = calculateTotalProduction();
        return CompletableFuture.completedFuture(total);
    }
}
