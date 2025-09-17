package com.Tech.energy_app.model;

import jakarta.persistence.*;

/**
 * Entidad EnergyType para tipos de energía.
 */
@Entity
@Table(name = "energy_type")
public class EnergyType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column
    private String description;

    // Constructor vacío (requerido por JPA)
    public EnergyType() {
    }

    // Constructor con parámetros
    public EnergyType(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Getters y setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
