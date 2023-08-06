package com.example.redwardDI.services;

import org.springframework.stereotype.Service;

/**
 * Created by r.edward on {06/08/2023}
 */
@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "HolAMundo con service DI";
    }
}
