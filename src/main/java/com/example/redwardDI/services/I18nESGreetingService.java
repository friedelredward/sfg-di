package com.example.redwardDI.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by r.edward on {06/08/2023}
 */
/*after this a profile must always be active or spring wont know which to instantiate!!*/
@Profile("ES")
@Service("i18nService")
public class I18nESGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "-ES-HolA con service DI";
    }
}
