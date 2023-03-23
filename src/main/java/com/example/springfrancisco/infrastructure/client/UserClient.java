package com.example.springfrancisco.infrastructure.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "client-1", url = "localhost:8082/user")
public interface UserClient {
  @RequestMapping(method = RequestMethod.GET, value = "/search")
  UserResponse getUser(@RequestParam String id);
}
