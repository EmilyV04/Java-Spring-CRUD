package com.example.springfrancisco.application;

import com.example.springfrancisco.domain.entities.Carro;
import com.example.springfrancisco.domain.servicies.CarGetService;
import com.example.springfrancisco.domain.servicies.CarSaveService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class CarSave {
  private final CarSaveService carSaveService;
  private final CarGetService carGetService;
  public Carro saveCar(Carro carro){
    Carro existCarro = carGetService.getCarro(carro.getPlaca());
    if(existCarro != null){
      log.warn("Ya existe un carro con esta placa");
      return null;
    }
    return carSaveService.save(carro);
  }
}
