package com.example.springfrancisco.domain.entities;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Data
public class Vehiculo implements Acelerar,Frenar, IniciarMarcha{
    private String marca;
    @Id
    private String placa;
    private String modelo;
    private Double precio;

    protected Vehiculo(String marca, String placa, String modelo, Double precio) {
        this.marca = marca;
        this.placa = placa;
        this.modelo = modelo;
        this.precio = precio;
    }
}
