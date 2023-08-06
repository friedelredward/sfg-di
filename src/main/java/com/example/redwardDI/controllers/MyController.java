package com.example.redwardDI.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by r.edward on {06/08/2023}
 */
@Controller
public class MyController {
    public String sayHello(){
        System.out.println("helloWorld in Console");
        return "Holamundo";
    }
}
