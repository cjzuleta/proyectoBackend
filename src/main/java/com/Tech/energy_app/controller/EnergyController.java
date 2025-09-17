<<<<<<< HEAD
/*
 * tienes endpoints sincrónicos y asíncronos. total-production-async devuelve inmediatamente
y el resultado se completa cuando la tarea en segundo plano termine.
 */
package com.Tech.energy_app.controller;

/**
 *
 * @author Cj Zuleta
 */
import com.Tech.energy_app.model.EnergyData;
import com.Tech.energy_app.service.EnergyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/api/energy/v2")
public class EnergyController {

    private final EnergyService service;

    public EnergyController(EnergyService service) { this.service = service; }

    @GetMapping("/types")
    public ResponseEntity<?> getTypes() {
        return ResponseEntity.ok(service.getAllTypes());
    }

    @GetMapping("/data")
    public ResponseEntity<List<EnergyData>> getData() {
        return ResponseEntity.ok(service.getAllData());
    }

    @GetMapping("/total-production")
    public ResponseEntity<Double> totalProduction() {
        return ResponseEntity.ok(service.calculateTotalProduction());
    }

    // Endpoint asíncrono
    @GetMapping("/total-production-async")
    public CompletableFuture<ResponseEntity<Double>> totalProductionAsync() {
        return service.calculateTotalProductionAsync()
                      .thenApply(ResponseEntity::ok);
    }
}
=======
/*
 * tienes endpoints sincrónicos y asíncronos. total-production-async devuelve inmediatamente
y el resultado se completa cuando la tarea en segundo plano termine.
 */
package com.Tech.energy_app.controller;

/**
 *
 * @author Cj Zuleta
 */
import com.Tech.energy_app.model.EnergyData;
import com.Tech.energy_app.service.EnergyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/api/energy/v2")
public class EnergyController {

    private final EnergyService service;

    public EnergyController(EnergyService service) { this.service = service; }

    @GetMapping("/types")
    public ResponseEntity<?> getTypes() {
        return ResponseEntity.ok(service.getAllTypes());
    }

    @GetMapping("/data")
    public ResponseEntity<List<EnergyData>> getData() {
        return ResponseEntity.ok(service.getAllData());
    }

    @GetMapping("/total-production")
    public ResponseEntity<Double> totalProduction() {
        return ResponseEntity.ok(service.calculateTotalProduction());
    }

    // Endpoint asíncrono
    @GetMapping("/total-production-async")
    public CompletableFuture<ResponseEntity<Double>> totalProductionAsync() {
        return service.calculateTotalProductionAsync()
                      .thenApply(ResponseEntity::ok);
    }
}
>>>>>>> 2826ef1 (Actualización: config BD y controladores)
