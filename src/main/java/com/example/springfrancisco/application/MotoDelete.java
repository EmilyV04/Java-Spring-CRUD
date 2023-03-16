package com.example.springfrancisco.application;

import com.example.springfrancisco.domain.servicies.MotoDeleteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MotoDelete {
  private final MotoDeleteService motoDeleteService;

  public void deleteMoto(String placa){
    motoDeleteService.deleteMoto(placa);
  }
}
