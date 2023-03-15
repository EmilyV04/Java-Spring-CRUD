package com.example.springfrancisco.infrastructure.adapter;

import com.example.springfrancisco.domain.entities.Moto;
import com.example.springfrancisco.domain.servicies.MotoSaveService;
import com.example.springfrancisco.infrastructure.mapper.MotoMapper;
import com.example.springfrancisco.infrastructure.repository.MotoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MotoSaveAdapter implements MotoSaveService {
  private final MotoRepository motoRepository;
  private final MotoMapper motoMapper;

  @Override
  public Moto save(Moto moto) {
    return motoMapper.toMotoEntity(motoRepository.save(motoMapper.ToMotoDto(moto)));
  }
}
