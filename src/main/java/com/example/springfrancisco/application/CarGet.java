package com.example.springfrancisco.application;

import com.example.springfrancisco.domain.entities.Carro;
import com.example.springfrancisco.domain.servicies.CarGetService;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class CarGet {
  private final CarGetService carGetService;

  public Carro getCarro(String placa){
    Carro carro = carGetService.getCarro(placa);
    if(carro == null){
      log.warn("No existe un carro con la placa ingresada");
      return null;
    }
    return carro;
  }

  public List<Carro> getListCarro(){
    return carGetService.getListCarro();
  }
}
