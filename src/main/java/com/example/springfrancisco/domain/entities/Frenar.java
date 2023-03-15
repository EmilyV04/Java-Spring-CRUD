package com.example.springfrancisco.domain.entities;

public interface Frenar
{
    default public void frenar(){
        System.out.println("Frenando el Vehículo.");
    }

}
