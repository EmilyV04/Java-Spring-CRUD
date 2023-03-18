package com.example.springfrancisco.infrastructure.event.publish;

import java.nio.charset.StandardCharsets;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class Publisher {
  private final RabbitTemplate rabbitTemplate;

  public void sendMessage(String message) {
    rabbitTemplate.send(MessageBuilder.withBody(message.getBytes(StandardCharsets.UTF_8)).build());
    log.info("Probando..."+message);
  }
}
