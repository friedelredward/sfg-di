package com.example.redwardDI.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by r.edward on {06/08/2023}
 */
@Profile("EN")
@Service("i18nService")
public class I18nENGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "-EN-Hello with service DI";
    }
}
