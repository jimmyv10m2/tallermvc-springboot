package com.springboot.clienteservice.util;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(value="com.springboot.clienteservice.util")
public class FeingClientConfig {
}
