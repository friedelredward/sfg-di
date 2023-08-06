package com.example.redwardDI.controllers;

import com.example.redwardDI.services.GreetingService;

/**
 * Created by r.edward on {06/08/2023}
 */
public class ManualPropertyInjectedController {
    public GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayHello();
    }
}
