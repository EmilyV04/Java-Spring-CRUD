package com.example.springfrancisco.application;

import com.example.springfrancisco.domain.servicies.CarDeleteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CarDelete {
  private final CarDeleteService carDeleteService;

  public void deleteCarro(String placa){
    carDeleteService.deleteCarro(placa);
  }

}
