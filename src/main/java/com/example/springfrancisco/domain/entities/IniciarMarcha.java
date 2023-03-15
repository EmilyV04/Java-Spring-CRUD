package com.example.springfrancisco.domain.entities;

public interface IniciarMarcha {
    default public void iniciarMarcha(){
        System.out.println("Iniciando marcha");
    }
}
