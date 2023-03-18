package com.example.springfrancisco.application;

import com.example.springfrancisco.domain.entities.Carro;
import com.example.springfrancisco.domain.servicies.RabbitPublishService;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RabbitPublish {
  private final RabbitPublishService rabbitPublishService;

  public void rabbitPublish(Carro carro) throws JsonProcessingException{
    rabbitPublishService.rabbitPublish(carro);
  }
}
