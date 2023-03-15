package com.example.springfrancisco.application;

import com.example.springfrancisco.domain.entities.Moto;
import com.example.springfrancisco.domain.servicies.MotoSaveService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MotoSave {
  private final MotoSaveService motoSaveService;

  public Moto saveMoto(Moto moto){
    return motoSaveService.save(moto);
  }
}
