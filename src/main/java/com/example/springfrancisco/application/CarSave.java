package com.example.springfrancisco.application;

import com.example.springfrancisco.domain.entities.Carro;
import com.example.springfrancisco.domain.servicies.CarSaveService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CarSave {
  private final CarSaveService carSaveService;
  public Carro saveCar(Carro carro){
    return carSaveService.save(carro);
  }
}
