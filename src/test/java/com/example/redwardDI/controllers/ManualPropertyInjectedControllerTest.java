package com.example.redwardDI.controllers;

import com.example.redwardDI.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 * Created by r.edward on {06/08/2023}
 * this would mimick the injection done by spring but manually
 */
class ManualPropertyInjectedControllerTest {
    ManualPropertyInjectedController controller;
    @BeforeEach
    void setUp() {
        controller= new ManualPropertyInjectedController();
        controller.greetingService= new GreetingServiceImpl();
    }

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}