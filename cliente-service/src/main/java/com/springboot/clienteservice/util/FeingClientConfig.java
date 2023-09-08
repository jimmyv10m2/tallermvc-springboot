package com.springboot.clienteservice.util;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
//para habilitar un cliente finjido o falso y se especifica donde va a estar el cliente
@EnableFeignClients(value="com.springboot.clienteservice.util")
public class FeingClientConfig {
}
