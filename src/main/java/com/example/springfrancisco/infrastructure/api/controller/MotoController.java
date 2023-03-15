package com.example.springfrancisco.infrastructure.api.controller;

import com.example.springfrancisco.application.MotoSave;
import com.example.springfrancisco.domain.entities.Moto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping(path="/moto")
public class MotoController {
  private final MotoSave motoSave;
  @PostMapping(value = "/create")
  public ResponseEntity<Moto> addMoto(@RequestBody Moto moto){
    return new ResponseEntity<>(motoSave.saveMoto(moto), HttpStatus.CREATED);
  }
}
