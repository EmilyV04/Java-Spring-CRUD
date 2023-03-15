package com.example.springfrancisco.infrastructure.adapter;

import com.example.springfrancisco.domain.servicies.CarDeleteService;
import com.example.springfrancisco.infrastructure.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CarDeleteAdapter implements CarDeleteService {
  private final CarRepository carRepository;

  @Override
  public void deleteCarro(String placa) {
    carRepository.deleteById(placa);
  }
}
