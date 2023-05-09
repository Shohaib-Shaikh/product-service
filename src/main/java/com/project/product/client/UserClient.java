package com.project.product.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "USER-SERVICE", url = "http://127.0.0.1:8086/user")
public interface UserClient {

    @GetMapping("message")
    String getMessageFromUserService();

}
