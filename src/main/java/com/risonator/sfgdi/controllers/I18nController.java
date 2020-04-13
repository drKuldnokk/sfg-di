package com.risonator.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class I18nController {

    private final GreetingService greetingService;

    public I18nController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayInternationalGreeting() {
        return greetingService.sayGreeting();
    }
}
