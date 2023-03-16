package com.example.springfrancisco.application;

import com.example.springfrancisco.domain.entities.Moto;
import com.example.springfrancisco.domain.servicies.MotoGetService;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class MotoGet {
  private final MotoGetService motoGetService;
  public Moto getMoto(String placa){
    Moto moto = motoGetService.getMoto(placa);
    if(moto == null){
      log.warn("No existe una moto con la placa ingresada");
      return null;
    }
    return moto;
  }
  public List<Moto> getListMoto(){
    return motoGetService.getListMoto();
  }
}
