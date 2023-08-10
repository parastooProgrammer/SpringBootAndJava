package com.example.demo.welcome.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("english")
public class EnglishWelcome implements WelcomeService {
    @Override
    public String sayHello(String name) {
        return "hello " + name;
    }
}
