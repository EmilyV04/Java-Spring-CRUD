package com.example.springfrancisco.infrastructure.adapter;

import com.example.springfrancisco.domain.entities.User;
import com.example.springfrancisco.domain.servicies.UserGetService;
import com.example.springfrancisco.infrastructure.client.UserClient;
import com.example.springfrancisco.infrastructure.mapper.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserGetAdapter implements UserGetService {
  private final UserClient userClient;
  private final UserMapper userMapper;

  @Override
  public User getUser(String id) {
    return userMapper.toUserEntity(userClient.getUser(id));
  }
}
