package com.example.springfrancisco.application;

import com.example.springfrancisco.domain.entities.Carro;
import com.example.springfrancisco.domain.servicies.CarEditService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CarEdit {
  private final CarEditService carEditService;

  public void editCarro(Carro carro){
    carEditService.editCarro(carro);
  }
}
