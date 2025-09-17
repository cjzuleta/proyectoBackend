/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tech.energy_app.exception;

/**
 *
 * @author Cj Zuleta
 */
public class EnergyException extends RuntimeException {
    public EnergyException(String message) { super(message); }
    public EnergyException(String message, Throwable cause) { super(message, cause); }
}
