package com.example.springfrancisco.infrastructure.api.controller;

import com.example.springfrancisco.application.MotoDelete;
import com.example.springfrancisco.application.MotoEdit;
import com.example.springfrancisco.application.MotoGet;
import com.example.springfrancisco.application.MotoSave;
import com.example.springfrancisco.domain.entities.Moto;
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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping(path="/moto")
public class MotoController {
  private final MotoSave motoSave;
  private final MotoGet motoGet;
  private final MotoEdit motoEdit;
  private final MotoDelete motoDelete;
  @PostMapping(value = "/create")
  public ResponseEntity<Moto> addMoto(@RequestBody Moto moto){
    return new ResponseEntity<>(motoSave.saveMoto(moto), HttpStatus.CREATED);
  }
  @GetMapping(value = "/search")
  public ResponseEntity<Moto> getMoto(@RequestParam String placa){
    return ResponseEntity.ok(motoGet.getMoto(placa));
  }
  @GetMapping(value = "/searchAll")
  public ResponseEntity<List<Moto>> getMoto(){
    return ResponseEntity.ok(motoGet.getListMoto());
  }
  @PutMapping(value = "/edit")
  public void editMoto(@RequestBody Moto moto){
    motoEdit.editMoto(moto);
  }
  @DeleteMapping(value = "/delete/{placa}")
  public void deleteMoto(@PathVariable("placa") String placa){
    motoDelete.deleteMoto(placa);
  }
}
