package com.example.springfrancisco.infrastructure.mapper;

import com.example.springfrancisco.domain.entities.Moto;
import com.example.springfrancisco.infrastructure.dto.MotoDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants.ComponentModel;
import org.mapstruct.Mappings;

@Mapper(componentModel = ComponentModel.SPRING)
public interface MotoMapper {
  Moto toMotoEntity(MotoDto motoDto);
  @Mappings({
      @Mapping(target="marca", source="marca"),
      @Mapping(target="placa", source="placa"),
      @Mapping(target="modelo", source="modelo"),
      @Mapping(target="precio", source="precio"),
      @Mapping(target="cilindraje", source="cilindraje"),
      @Mapping(target = "esElectrica", source = "esElectrica")
  })
  MotoDto ToMotoDto(Moto moto);
}
