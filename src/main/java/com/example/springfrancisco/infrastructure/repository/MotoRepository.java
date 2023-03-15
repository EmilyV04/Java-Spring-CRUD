package com.example.springfrancisco.infrastructure.repository;

import com.example.springfrancisco.infrastructure.dto.MotoDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotoRepository extends JpaRepository<MotoDto, String> {

}
