package com.example.springfrancisco.application;

import com.example.springfrancisco.domain.entities.Moto;
import com.example.springfrancisco.domain.servicies.MotoGetService;
import com.example.springfrancisco.domain.servicies.MotoSaveService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class MotoSave {
  private final MotoSaveService motoSaveService;
  private final MotoGetService motoGetService;

  public Moto saveMoto(Moto moto){
    Moto existMoto = motoGetService.getMoto(moto.getPlaca());
    if(existMoto != null){
      log.warn("Ya existe una moto con esta placa");
      return null;
    }
    return motoSaveService.save(moto);
  }
}
