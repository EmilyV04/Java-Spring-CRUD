package com.example.springfrancisco.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
  private String Id;
  private String typeId;
  private String name;
  private String lastName;
}
