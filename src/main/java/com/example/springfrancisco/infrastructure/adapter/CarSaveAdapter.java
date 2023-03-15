package com.example.springfrancisco.infrastructure.adapter;

import com.example.springfrancisco.domain.entities.Carro;
import com.example.springfrancisco.domain.servicies.CarSaveService;
import com.example.springfrancisco.infrastructure.dto.CarroDto;
import com.example.springfrancisco.infrastructure.mapper.CarroMapper;
import com.example.springfrancisco.infrastructure.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CarSaveAdapter implements CarSaveService {
  private final CarRepository carRepository;
  private final CarroMapper carroMapper;
  @Override
  public Carro save(Carro carro){
    //return buildCarro(carRepository.save(buildCarroDto(carro)));
    return carroMapper.toCarroEntity(carRepository.save(carroMapper.toCarroDto(carro)));
  }

  /*private CarroDto buildCarroDto(Carro carro){
    return new CarroDto(carro.getMarca(), carro.getPlaca(), carro.getModelo(), carro.getPrecio(), carro.getColor());
  }

  private Carro buildCarro(CarroDto carroDto){
    return new Carro(carroDto.getMarca(), carroDto.getPlaca(), carroDto.getModelo(), carroDto.getPrecio(), carroDto.getColor());
  }*/
}
