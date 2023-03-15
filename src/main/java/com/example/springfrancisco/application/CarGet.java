package com.example.springfrancisco.application;

import com.example.springfrancisco.domain.entities.Carro;
import com.example.springfrancisco.domain.servicies.CarGetService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CarGet {
  private final CarGetService carGetService;

  public Carro getCarro(String placa){
    return carGetService.getCarro(placa);
  }

  public List<Carro> getListCarro(){
    return carGetService.getListCarro();
  }
}
