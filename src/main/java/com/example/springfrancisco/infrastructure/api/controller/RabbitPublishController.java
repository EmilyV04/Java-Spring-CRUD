package com.example.springfrancisco.infrastructure.api.controller;

import com.example.springfrancisco.application.RabbitPublish;
import com.example.springfrancisco.domain.entities.Carro;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/publisher")
public class RabbitPublishController {
  private final RabbitPublish rabbitPublish;

  @PostMapping
  public void rabbitPublish(@RequestBody Carro carro) throws JsonProcessingException {
    rabbitPublish.rabbitPublish(carro);
  }
}
