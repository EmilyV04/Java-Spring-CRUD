package com.example.springfrancisco.application;

import com.example.springfrancisco.domain.entities.Moto;
import com.example.springfrancisco.domain.servicies.MotoGetService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MotoGet {
  private final MotoGetService motoGetService;
  public Moto getMoto(String placa){
    return motoGetService.getMoto(placa);
  }
  public List<Moto> getListMoto(){
    return motoGetService.getListMoto();
  }
}
