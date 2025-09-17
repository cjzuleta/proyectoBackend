<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tech.energy_app.model;

/**
 *
 * @author Cj Zuleta
 */
import jakarta.persistence.*;

@Entity
@Table(name = "energydata")
public class EnergyData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer year;
    private Double production;
    private Double consumption;

    @ManyToOne
    @JoinColumn(name = "energy_type_id")
    private EnergyType energyType;

    // getters y setters...

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the year
     */
    public Integer getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(Integer year) {
        this.year = year;
    }

    /**
     * @return the production
     */
    public Double getProduction() {
        return production;
    }

    /**
     * @param production the production to set
     */
    public void setProduction(Double production) {
        this.production = production;
    }

    /**
     * @return the consumption
     */
    public Double getConsumption() {
        return consumption;
    }

    /**
     * @param consumption the consumption to set
     */
    public void setConsumption(Double consumption) {
        this.consumption = consumption;
    }

    /**
     * @return the energyType
     */
    public EnergyType getEnergyType() {
        return energyType;
    }

    /**
     * @param energyType the energyType to set
     */
    public void setEnergyType(EnergyType energyType) {
        this.energyType = energyType;
    }
    
    
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tech.energy_app.model;

/**
 *
 * @author Cj Zuleta
 */
import jakarta.persistence.*;

@Entity
@Table(name = "energydata")
public class EnergyData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer year;
    private Double production;
    private Double consumption;

    @ManyToOne
    @JoinColumn(name = "energy_type_id")
    private EnergyType energyType;

    // getters y setters...

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the year
     */
    public Integer getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(Integer year) {
        this.year = year;
    }

    /**
     * @return the production
     */
    public Double getProduction() {
        return production;
    }

    /**
     * @param production the production to set
     */
    public void setProduction(Double production) {
        this.production = production;
    }

    /**
     * @return the consumption
     */
    public Double getConsumption() {
        return consumption;
    }

    /**
     * @param consumption the consumption to set
     */
    public void setConsumption(Double consumption) {
        this.consumption = consumption;
    }

    /**
     * @return the energyType
     */
    public EnergyType getEnergyType() {
        return energyType;
    }

    /**
     * @param energyType the energyType to set
     */
    public void setEnergyType(EnergyType energyType) {
        this.energyType = energyType;
    }
    
    
>>>>>>> 2826ef1 (Actualización: config BD y controladores)
}