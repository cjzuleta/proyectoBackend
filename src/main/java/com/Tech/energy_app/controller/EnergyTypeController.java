/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tech.energy_app.controller;

/**
 *
 * @author Cj Zuleta
 */


import com.Tech.energy_app.model.EnergyType;
import com.Tech.energy_app.repository.EnergyTypeRepository;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/energy/types")
public class EnergyTypeController {

    private final EnergyTypeRepository repo;

    public EnergyTypeController(EnergyTypeRepository repo) {
        this.repo = repo;
    }

    // GET: listar todos
    @GetMapping
    public List<EnergyType> getAll() {
        return repo.findAll();
    }

    // GET: por id
    @GetMapping("/{id}")
    public ResponseEntity<EnergyType> getById(@PathVariable Integer id) {
        return repo.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // POST: crear nuevo
    @PostMapping
    public ResponseEntity<EnergyType> create(@RequestBody EnergyType type) {
        return ResponseEntity.status(HttpStatus.CREATED).body(repo.save(type));
    }

    // PUT: actualizar
    @PutMapping("/{id}")
    public ResponseEntity<EnergyType> update(@PathVariable Integer id, @RequestBody EnergyType type) {
        return repo.findById(id).map(existing -> {
            existing.setName(type.getName());
            return ResponseEntity.ok(repo.save(existing));
        }).orElse(ResponseEntity.notFound().build());
    }

    // DELETE: eliminar
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
