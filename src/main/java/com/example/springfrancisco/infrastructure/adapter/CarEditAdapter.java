package com.example.springfrancisco.infrastructure.adapter;

import com.example.springfrancisco.domain.entities.Carro;
import com.example.springfrancisco.domain.servicies.CarEditService;
import com.example.springfrancisco.infrastructure.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class CarEditAdapter implements CarEditService {
  private final CarRepository carRepository;
  @Transactional
  public void editCarro(Carro carro){
    carRepository.updateCarro(carro.getMarca(),
                              carro.getPlaca(),
                              carro.getModelo(),
                              carro.getPrecio(),
                              carro.getColor());
  }
}
