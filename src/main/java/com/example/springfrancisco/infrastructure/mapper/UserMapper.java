package com.example.springfrancisco.infrastructure.mapper;

import com.example.springfrancisco.domain.entities.User;
import com.example.springfrancisco.infrastructure.client.UserResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface UserMapper {
  User toUserEntity(UserResponse userResponse);
  UserResponse toUserResponse(User user);
}
