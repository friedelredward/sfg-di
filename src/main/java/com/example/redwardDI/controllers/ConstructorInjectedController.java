package com.example.redwardDI.controllers;

import com.example.redwardDI.services.GreetingService;

/**
 * Created by r.edward on {06/08/2023}
 * Note no annotation is used and we are mimicking
 * the Dependeny injection in the stup method of the code!!!
 */
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayHello();
    }
}
