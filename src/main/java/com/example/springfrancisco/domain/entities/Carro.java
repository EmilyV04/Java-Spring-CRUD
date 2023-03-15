package com.example.springfrancisco.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Carro extends Vehiculo{
    private String color;

    public Carro(String marca, String placa, String modelo, Double precio, String color) {
        super(marca, placa, modelo, precio);
        this.color = color;
    }

    /*@Override
    public int compareTo(Vehiculo o) {
        return 0;
    }*/
}
