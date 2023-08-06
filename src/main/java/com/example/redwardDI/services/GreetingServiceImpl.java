package com.example.redwardDI.services;

/**
 * Created by r.edward on {06/08/2023}
 */
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "HolAMundo con service DI";
    }
}
