package com.example.demo.welcome.controller;

import com.example.demo.welcome.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/")
public class WelcomeController {

    @Autowired
    WelcomeService welcomeService;

    @RequestMapping(value = "hello/{name}",method = RequestMethod.GET)
    public String welcome(@PathVariable(value = "name") String name){
        return welcomeService.sayHello(name);
    }
}
