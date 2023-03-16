package com.example.springfrancisco.infrastructure.repository;

import com.example.springfrancisco.infrastructure.dto.MotoDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MotoRepository extends JpaRepository<MotoDto, String> {
  @Query(nativeQuery = true, value = "update moto_dto set marca = :marca, modelo = :modelo, precio = :precio, cilindraje = :cilindraje, es_electrica = :esElectrica where placa = :placa")
  @Modifying
  void updateMoto(@Param("marca") String marca,
                  @Param("placa") String placa,
                  @Param("modelo") String modelo,
                  @Param("precio") Double precio,
                  @Param("cilindraje") Integer cilindraje,
                  @Param("esElectrica") Boolean esElectrica);
}
