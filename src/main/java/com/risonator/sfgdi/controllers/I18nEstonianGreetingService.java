package com.risonator.sfgdi.controllers;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ET")
@Service("i18nService")
public class I18nEstonianGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Tervitus, kallis maailm!";
    }
}
