package com.example.springfrancisco.infrastructure.adapter;

import com.example.springfrancisco.domain.entities.Moto;
import com.example.springfrancisco.domain.servicies.MotoGetService;
import com.example.springfrancisco.infrastructure.dto.MotoDto;
import com.example.springfrancisco.infrastructure.mapper.MotoMapper;
import com.example.springfrancisco.infrastructure.repository.MotoRepository;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MotoGetAdapter implements MotoGetService {
  private final MotoRepository motoRepository;
  private final MotoMapper motoMapper;

  @Override
  public Moto getMoto(String placa) {
    Optional<MotoDto> motoDto = motoRepository.findById(placa);
    return motoDto.map(motoMapper::toMotoEntity).orElse(null);
  }

  @Override
  public List<Moto> getListMoto() {
    List<MotoDto> motosDto = motoRepository.findAll();
    return motosDto.stream().map(motoMapper::toMotoEntity).toList();
  }
}
