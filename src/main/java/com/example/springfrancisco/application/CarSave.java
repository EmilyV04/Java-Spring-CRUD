package com.example.springfrancisco.application;

import com.example.springfrancisco.domain.entities.Carro;
import com.example.springfrancisco.domain.entities.User;
import com.example.springfrancisco.domain.servicies.CarGetService;
import com.example.springfrancisco.domain.servicies.CarSaveService;
import com.example.springfrancisco.domain.servicies.UserGetService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class CarSave {
  private final CarSaveService carSaveService;
  private final CarGetService carGetService;
  private final UserGetService userGetService;
  public Carro saveCar(Carro carro, String id){
    //Carro existCarro = carGetService.getCarro(carro.getPlaca());
    User existUser = userGetService.getUser(id);
    if(existUser == null){
      log.warn("No existe una persona con ese Id");
      return null;
    }
    return carSaveService.save(carro);
  }
}
