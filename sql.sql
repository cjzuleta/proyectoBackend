CREATE DATABASE IF NOT EXISTS energydb;
USE energydb;

CREATE TABLE EnergyType (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE EnergyData (
    id INT PRIMARY KEY AUTO_INCREMENT,
    year INT NOT NULL,
    production DOUBLE,
    consumption DOUBLE,
    energy_type_id INT,
    FOREIGN KEY (energy_type_id) REFERENCES EnergyType(id)
);

CREATE TABLE Users (
    id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(255) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(255)
);

-- Datos iniciales
INSERT INTO EnergyType (name) VALUES ('Hidroelectrica'), ('Eolica'), ('Solar');

INSERT INTO EnergyData (year, production, consumption, energy_type_id)
VALUES (2020, 1234.56, 987.65, 1),
       (2020, 2345.67, 876.54, 2);

INSERT INTO Users (username, password, email)
VALUES ('admin', 'admin123', 'admin@mail.com');
