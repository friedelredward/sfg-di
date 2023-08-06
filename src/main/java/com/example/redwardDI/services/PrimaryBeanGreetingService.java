package com.example.redwardDI.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by r.edward on {06/08/2023}
 */
@Primary
@Service
public class PrimaryBeanGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "-PrimaryBean-HolA con service DI";
    }
}
