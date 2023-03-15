package com.example.springfrancisco.infrastructure.adapter;

import com.example.springfrancisco.domain.entities.Carro;
import com.example.springfrancisco.domain.servicies.CarGetService;
import com.example.springfrancisco.infrastructure.dto.CarroDto;
import com.example.springfrancisco.infrastructure.mapper.CarroMapper;
import com.example.springfrancisco.infrastructure.repository.CarRepository;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CarGetAdapter implements CarGetService {
  private final CarRepository carRepository;
  private final CarroMapper carroMapper;

  @Override
  public Carro getCarro(String placa) {
    Optional<CarroDto> carroDto = carRepository.findById(placa);
    //return carroDto.map(this::buildCarro).orElse(null);
    return carroDto.map(carroMapper::toCarroEntity).orElse(null);
  }

  @Override
  public List<Carro> getListCarro() {
    List<CarroDto> carrosDto = carRepository.findAll();
    //return carrosDto.stream().map(this::buildCarro).toList();
    return carrosDto.stream().map(carroMapper::toCarroEntity).toList();
  }

  /*private Carro buildCarro(CarroDto carroDto){
    return new Carro(carroDto.getMarca(), carroDto.getPlaca(), carroDto.getModelo(), carroDto.getPrecio(), carroDto.getColor());
  }*/
}
