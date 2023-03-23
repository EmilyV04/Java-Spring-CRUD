package com.example.springfrancisco.infrastructure.api.controller;

import com.example.springfrancisco.application.CarDelete;
import com.example.springfrancisco.application.CarEdit;
import com.example.springfrancisco.application.CarGet;
import com.example.springfrancisco.application.CarSave;
import com.example.springfrancisco.domain.entities.Carro;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@AllArgsConstructor
@RestController
@RequestMapping(path="/car")
public class CarController {
  private final CarSave carSave;
  private final CarGet carGet;
  private final CarEdit carEdit;
  private final CarDelete carDelete;
  @GetMapping(value = "/search")
  public ResponseEntity<Carro> getCar(@RequestParam String placa){
    return ResponseEntity.ok(carGet.getCarro(placa));
  }
  @GetMapping(value = "/searchAll")
  public ResponseEntity<List<Carro>> getListCar(){
    return ResponseEntity.ok(carGet.getListCarro());
  }
  @PostMapping(value = "/create")
  public ResponseEntity<Carro> addCar(@RequestBody Carro car, @RequestHeader("id") String id){
    return new ResponseEntity<>(carSave.saveCar(car, id), HttpStatus.CREATED);
  }
  @PutMapping(value = "/edit")
  public void editCar(@RequestBody Carro car){
    carEdit.editCarro(car);
  }
  @DeleteMapping(value = "/delete/{placa}")
  public void deleteCar(@PathVariable("placa") String placa){
    carDelete.deleteCarro(placa);
  }
}
