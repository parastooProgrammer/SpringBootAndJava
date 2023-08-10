package com.example.demo.welcome.service;

import org.springframework.stereotype.Component;

@Component
public interface WelcomeService {
    String sayHello(String name);
}
