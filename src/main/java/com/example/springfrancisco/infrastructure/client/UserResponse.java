package com.example.springfrancisco.infrastructure.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
  private String Id;
  private String typeId;
  private String name;
  private String lastName;
}
