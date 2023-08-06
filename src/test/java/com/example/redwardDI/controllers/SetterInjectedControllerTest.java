package com.example.redwardDI.controllers;

import com.example.redwardDI.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 * Created by r.edward on {06/08/2023}
 */
class SetterInjectedControllerTest {
    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller= new SetterInjectedController();
        // ojo aki como se injecta siempre la impl!
        // con new pero esta vez con setter
        controller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void setGreetingService() {
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}