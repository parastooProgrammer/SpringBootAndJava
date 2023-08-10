package com.example.demo.welcome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SignalController {

    @RequestMapping("/signal")
    private String getSignal(Model model) {
        model.addAttribute("message", "Hello from Spring MVC ThymeLeaf");
        return "signal";
    }
}
