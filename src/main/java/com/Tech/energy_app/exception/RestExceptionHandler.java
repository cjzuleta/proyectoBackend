/*
 * 
 */
package com.Tech.energy_app.exception;

/**
 *
 * @author Cj Zuleta
 */
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(EnergyException.class)
    public ResponseEntity<String> handleEnergy(EnergyException ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleAll(Exception ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                             .body("Error inesperado: " + ex.getMessage());
    }
}
