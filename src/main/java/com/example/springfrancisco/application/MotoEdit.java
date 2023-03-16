package com.example.springfrancisco.application;

import com.example.springfrancisco.domain.entities.Moto;
import com.example.springfrancisco.domain.servicies.MotoEditService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MotoEdit {
  private final MotoEditService motoEditService;

  public void editMoto(Moto moto){
    motoEditService.editMoto(moto);
  }
}
