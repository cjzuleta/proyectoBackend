/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tech.energy_app.controller;

/**
 *
 * @author Cj Zuleta
 */
import com.Tech.energy_app.model.EnergyData;
import com.Tech.energy_app.repository.EnergyDataRepository;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/energy/data")
public class EnergyDataController {

    private final EnergyDataRepository repo;

    public EnergyDataController(EnergyDataRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<EnergyData> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EnergyData> getById(@PathVariable Integer id) {
        return repo.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<EnergyData> create(@RequestBody EnergyData data) {
        return ResponseEntity.status(HttpStatus.CREATED).body(repo.save(data));
    }

    @PutMapping("/{id}")
    public ResponseEntity<EnergyData> update(@PathVariable Integer id, @RequestBody EnergyData data) {
        return repo.findById(id).map(existing -> {
            existing.setYear(data.getYear());
            existing.setProduction(data.getProduction());
            existing.setConsumption(data.getConsumption());
            existing.setEnergyType(data.getEnergyType());
            return ResponseEntity.ok(repo.save(existing));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
