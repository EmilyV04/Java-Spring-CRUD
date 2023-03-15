package com.example.springfrancisco.domain.entities;

public interface Acelerar {
    default public void acelerarVehiculo(){
        System.out.println("Acelenrando el vehículo.");
    }
}
