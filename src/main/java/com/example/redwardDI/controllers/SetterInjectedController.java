package com.example.redwardDI.controllers;

import com.example.redwardDI.services.GreetingService;

/**
 * Created by r.edward on {06/08/2023}
 */
public class SetterInjectedController {
    private GreetingService greetingService;

    /** alt insert > generate setter*/
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayHello();
    }
}
