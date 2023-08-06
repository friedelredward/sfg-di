package com.example.redwardDI.controllers;

import com.example.redwardDI.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by r.edward on {06/08/2023}
 */
@Controller
public class ManualPropertyInjectedController {
    @Autowired
    public GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayHello();
    }
}
