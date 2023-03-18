package com.example.springfrancisco.infrastructure.adapter;

import com.example.springfrancisco.domain.entities.Carro;
import com.example.springfrancisco.domain.servicies.RabbitPublishService;
import com.example.springfrancisco.infrastructure.event.publish.Publisher;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RabbitPublishAdapter implements RabbitPublishService {
  private final Publisher publisher;
  private final ObjectMapper objectMapper;

  @Override
  public void rabbitPublish(Carro carro) throws JsonProcessingException {
    publisher.sendMessage(objectMapper.writeValueAsString(carro));
  }
}
