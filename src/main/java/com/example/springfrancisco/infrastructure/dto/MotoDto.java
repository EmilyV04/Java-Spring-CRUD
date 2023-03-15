package com.example.springfrancisco.infrastructure.dto;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class MotoDto extends VehiculoDto {
  private Integer cilindraje;
  private Boolean esElectrica;

  public MotoDto(String marca, String placa, String modelo, Double precio, Integer cilindraje,
      Boolean esElectrica) {
    super(marca, placa, modelo, precio);
    this.cilindraje = cilindraje;
    this.esElectrica = esElectrica;
  }
}
