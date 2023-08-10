package com.example.demo.welcome.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("german")
public class GermanWelcome implements WelcomeService {
    @Override
    public String sayHello(String name) {
        return "Halo " + name;
    }
}
