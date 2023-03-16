package com.example.springfrancisco.domain.servicies;

import com.example.springfrancisco.domain.entities.Moto;
import java.util.List;

public interface MotoGetService {
  Moto getMoto(String placa);
  List<Moto> getListMoto();
}
