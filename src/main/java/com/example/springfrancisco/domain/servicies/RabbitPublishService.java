package com.example.springfrancisco.domain.servicies;

import com.example.springfrancisco.domain.entities.Carro;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface RabbitPublishService {
  void rabbitPublish(Carro carro) throws JsonProcessingException;
}
