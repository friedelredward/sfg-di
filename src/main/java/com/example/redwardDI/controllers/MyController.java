package com.example.redwardDI.controllers;

import com.example.redwardDI.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by r.edward on {06/08/2023}
 */
@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayHello();
    }
}
