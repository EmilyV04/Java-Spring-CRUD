package com.example.springfrancisco.domain.servicies;

import com.example.springfrancisco.domain.entities.Carro;
import java.util.List;

public interface CarGetService {
  Carro getCarro(String placa);
  List<Carro> getListCarro();
}
