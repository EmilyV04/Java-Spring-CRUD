package com.example.springfrancisco.infrastructure.adapter;

import com.example.springfrancisco.domain.entities.Moto;
import com.example.springfrancisco.domain.servicies.MotoEditService;
import com.example.springfrancisco.infrastructure.repository.MotoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class MotoEditAdapter implements MotoEditService {
  private final MotoRepository motoRepository;
  @Transactional
  public void editMoto(Moto moto) {
    motoRepository.updateMoto(moto.getMarca(),
                              moto.getPlaca(),
                              moto.getModelo(),
                              moto.getPrecio(),
                              moto.getCilindraje(),
                              moto.getEsElectrica());
  }
}
