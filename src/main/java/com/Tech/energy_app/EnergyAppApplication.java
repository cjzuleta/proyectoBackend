package com.Tech.energy_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.*;
import java.util.concurrent.*;

@SpringBootApplication
@EnableAsync //activa la ejecución asíncrona; definimos taskExecutor (pool de 4 hilos).
public class EnergyAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnergyAppApplication.class, args);
	}

        @Bean(name = "taskExecutor")
    public Executor taskExecutor() {
        ThreadPoolExecutor exec = (ThreadPoolExecutor) Executors.newFixedThreadPool(4);
        return exec;
    }
    
    
}
